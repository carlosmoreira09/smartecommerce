package br.com.fiap.smartecommerce.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
			
		return new ModelAndView("produto/listarprodutos").addObject("produtos", dao.listar());
	}
	
	@GetMapping("cadastroproduto")
	public ModelAndView cadastrarproduto(CadastroProduto produto) {
			ModelAndView mv = new ModelAndView("produto/cadastroproduto", "produto", new CadastroProduto());
	       return mv;
	}
	
	@Transactional
	@PostMapping("addproduto")
	public ModelAndView submit(CadastroProduto produto, RedirectAttributes redirect) throws ServletException, IOException {
		

		try { 
			       	
        	dao.cadastrar(produto);
        	
        	redirect.addFlashAttribute("msg", "Produto cadastrado com sucesso");
        	
        	return new ModelAndView("produto/listarprodutos").addObject("produtos", dao.listar());
        	
        } catch(Exception e) {
        	e.printStackTrace();
        	return new ModelAndView("produto/cadastroproduto").addObject("msg", e.getMessage());
        }
      
	}
	
	@GetMapping("listar")
	public ModelAndView listar() {
		return new ModelAndView("produto/listarprodutos").addObject("produtos", dao.listar());
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
		return new ModelAndView("redirect:/produto/listarprodutos");
	}


	@Transactional
	@PostMapping("excluir")
	public ModelAndView excluir(HttpServletRequest request, RedirectAttributes redirect) {
		try {
			
			int id_produto = Integer.parseInt(request.getParameter("id_produto"));
			dao.remover(id_produto);
			redirect.addFlashAttribute("msg", "Excluido!");
		}catch(Exception e) {
			redirect.addFlashAttribute("msg", "Codigo não Encontrado! Erro:" + e.getMessage());
		}
		return new ModelAndView("produto/listarprodutos").addObject("produtos", dao.listar());
	}

}
