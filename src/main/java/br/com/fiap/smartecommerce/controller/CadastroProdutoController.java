package br.com.fiap.smartecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@GetMapping("cadastrarproduto")
	public ModelAndView cadastrarproduto() {
			
	       return new ModelAndView("produto/cadastroproduto", "produto", new CadastroProduto());
	}

	
	
	@Transactional
	@PostMapping("addproduto")
	  public String submit(@Valid @ModelAttribute("produto")CadastroProduto produto, 
		      BindingResult result, ModelMap model) {
		        if (result.hasErrors()) {
		            return "error";
		        }
		        model.addAttribute("categoria_produto", produto.getCategoriaProduto());
		        model.addAttribute("ds_produto", produto.getDescricaoProduto());
		        model.addAttribute("vl_produto", produto.getValorProduto());
		        return "cadastroproduto";
	}
//	public ModelAndView processarForm(CadastroProduto produto, RedirectAttributes redirect) {
//		try {
//			
//			dao.cadastrar(produto);
//			redirect.addFlashAttribute("msg", "Produto cadastrado");
//			return new ModelAndView("redirect:/produto/cadastroproduto");
//		} catch (Exception e) {
//			e.printStackTrace();
//			return new ModelAndView("produto/cadastroproduto").addObject("msg", e.getMessage());
//		}
//
//	}
}
