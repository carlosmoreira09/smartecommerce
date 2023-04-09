package br.com.fiap.smartecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fiap.smartecommerce.dao.UserLoginDAO;

@Controller
public class UserLoginController {

    @Autowired
    private UserLoginDAO userLogin;

    @GetMapping("/userlogin")
    public String abrirForm() {
        return "login/userlogin";
    }

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }
}
