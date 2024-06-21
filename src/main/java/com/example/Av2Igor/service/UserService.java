package com.example.Av2Igor.service;

import com.example.Av2Igor.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String generateToken(String nomeUsuario) {
        String token = JwtUtil.generateToken(nomeUsuario);
        return token;
    }

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;
    }
}
