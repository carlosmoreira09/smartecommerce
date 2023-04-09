package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.smartecommerce.dao.CadastroClienteDAO;
import br.com.fiap.smartecommerce.model.CadastroCliente;

@Controller
@RequestMapping("cliente")
public class CadastroClienteController {
    
    @Autowired
    private CadastroClienteDAO dao;

    @GetMapping("cadastrar")
    public String getFormularioCadastro(CadastroCliente cliente) {
        return "cliente/cadastrarcliente";
    }
}
