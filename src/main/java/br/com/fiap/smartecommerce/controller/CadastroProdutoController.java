package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.smartecommerce.dao.CadastroProdutoDAO;
import br.com.fiap.smartecommerce.model.CadastroProduto;

@Controller
@RequestMapping("/produto")
public class CadastroProdutoController {
		
	
	@Autowired
	private CadastroProdutoDAO dao;

	@GetMapping("/")
	public ModelAndView index() {
			
		return new ModelAndView("produto/listar").addObject("produtos", dao.listar());
	}
	
	@GetMapping("cadastroproduto")
	public ModelAndView cadastrarproduto(CadastroProduto produto) {
			ModelAndView mv = new ModelAndView("produto/cadastroproduto", "produto", new CadastroProduto());
	       return mv;
	}
	
	@Transactional
	@PostMapping("addproduto")
	public ModelAndView submit(CadastroProduto produto, RedirectAttributes redirect, ModelMap model) {
		

		try { 
        	
        	redirect.addFlashAttribute("msg", "Produto cadastrado");
        	
        	dao.cadastrar(produto);
        	
        	return new ModelAndView("redirect:/produto/cadastroproduto");

        } catch(Exception e) {
        	
        	e.printStackTrace();
        	return new ModelAndView("produto/cadastroproduto").addObject("msg", e.getMessage());
        }
      
	}
	
	@GetMapping("listar")
	public ModelAndView listar() {
		return new ModelAndView("produto/listar").addObject("produtos", dao.listar());
	}
	
	@GetMapping("editar/{id}")
	public ModelAndView editar(@PathVariable("id") int codigo) {
		return new ModelAndView("produto/edicao").addObject("produto", dao.buscar(codigo));
	}

	@Transactional
	@PostMapping("editar")
	public ModelAndView editar(CadastroProduto produto, RedirectAttributes redirect) {
		try {
			dao.atualizar(produto);
			redirect.addFlashAttribute("msg", "Atualizado");
		} catch (Exception e) {
			return new ModelAndView("produto/edicao").addObject("msg", e.getMessage());
		}
		return new ModelAndView("redirect:/produto/listar");
	}


	@Transactional
	@PostMapping("excluir")
	public String excluir(int codigo, RedirectAttributes redirect) {
		try {
			dao.remover(codigo);
			redirect.addFlashAttribute("msg", "Excluido!");
		}catch(Exception e) {
			redirect.addFlashAttribute("msg", e.getMessage());
		}
		return "redirect:/produto/listar";
	}

}
