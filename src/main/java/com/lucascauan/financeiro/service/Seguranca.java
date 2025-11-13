package com.lucascauan.financeiro.service;

public class Seguranca {
    public static boolean autenticar(String usuario, String senha) {
        // Simples autenticação (exemplo)
        return "admin".equals(usuario) && "1234".equals(senha);
    }
}

