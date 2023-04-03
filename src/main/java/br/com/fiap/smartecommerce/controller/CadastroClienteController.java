package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.smartecommerce.dao.CadastroClienteDAO;
import br.com.fiap.smartecommerce.model.CadastroCliente;


@RequestMapping("cliente")
public class CadastroClienteController {
		
	
	@Autowired
	private CadastroClienteDAO dao;

	@GetMapping("cadastrarcliente")
	public String abrirForm(CadastroCliente cliente) {
		return "cliente/cadastrarcliente";
	}

}
