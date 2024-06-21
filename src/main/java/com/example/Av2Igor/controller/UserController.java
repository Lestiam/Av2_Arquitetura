package com.example.Av2Igor.controller;

import com.example.Av2Igor.model.UserEntity;
import com.example.Av2Igor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/cadastrar")
    public String cadastrar(@RequestBody UserEntity usuario) {
        String token = userService.generateToken(usuario.getNome());
        return "Token: " + token;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserEntity usuario) {
        String token = userService.generateToken(usuario.getNome());
        return "Token: " + token;
    }


    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {
        String username = userService.extractUsername(token);
        return username;
    }

    @Secured("GERENTE")
    @GetMapping(value = "/manager/{token}")
    public String buscaGerente(@PathVariable String token) {
        System.out.println("Chegou no gerente!");
        String nomeUsuario = userService.extractUsername(token);
        return "Manager: " + nomeUsuario;
    }

    @Secured("ADMIN")
    @GetMapping(value = "/admin/{token}")
    public String buscaAdmin(@PathVariable String token) {
        System.out.println("Chegou no admin!");
        String nomeUsuario = userService.extractUsername(token);
        return "Admin: " + nomeUsuario;
    }

    @Secured("USUARIO")
    @GetMapping(value = "/user/{token}")
    public String buscaUsuario(@PathVariable String token) {
        System.out.println("Chegou no usuário!");
        String nomeUsuario = userService.extractUsername(token);
        return "User: " + nomeUsuario;
    }
}
