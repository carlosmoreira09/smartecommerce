package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.smartecommerce.dao.CadastroVendedorDAO;
import br.com.fiap.smartecommerce.model.CadastroVendedor;

@Controller
@RequestMapping("vendedor")
public class CadastroVendedorController {

    @Autowired
    private CadastroVendedorDAO dao;

    @GetMapping("cadastro")
    public String getFormularioCadastro(CadastroVendedor vendedor) {
        return "vendedor/cadastrovendedor";
    }

}
