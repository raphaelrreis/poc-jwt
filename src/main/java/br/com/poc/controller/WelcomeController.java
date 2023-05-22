package br.com.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Bem vindo a POC JWT";
    }
    @GetMapping("/users")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
}
