package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.smartecommerce.dao.CadastroClienteDAO;
import br.com.fiap.smartecommerce.model.CadastroCliente;
import br.com.fiap.smartecommerce.model.CadastroProduto;


@RequestMapping("/cliente")
public class CadastroClienteController {
		
	
	@Autowired
	private CadastroClienteDAO dao;

	@GetMapping("/")
	public String abrirForm(CadastroCliente cliente) {
		return "cliente/cadastrarcliente";
	}
	
}
