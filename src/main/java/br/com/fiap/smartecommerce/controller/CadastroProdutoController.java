package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.smartecommerce.dao.CadastroProdutoDAO;
import br.com.fiap.smartecommerce.model.CadastroProduto;

@Controller
@RequestMapping("produto")
public class CadastroProdutoController {
		
	
	@Autowired
	private CadastroProdutoDAO dao;

	@GetMapping("/")
	public String abrirForm(CadastroProduto produto) {
		return "produto/cadastroproduto";
	}

}
