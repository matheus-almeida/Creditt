package br.com.creditt.controllers;

import br.com.creditt.models.User;
import br.com.creditt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/idea")
    public String index(){
        return "idea";
    }

    @RequestMapping(value= "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("nome") String fName, @RequestParam("sobrenome") String sName, @RequestParam("email") String mail,
                         @RequestParam("senha") String password){

        User novoUsuario = new User(fName, sName, mail, password);
        service.salvar(novoUsuario);

        return "main";
    }
}
