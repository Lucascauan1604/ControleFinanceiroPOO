package com.lucascauan.financeiro.service;

import com.lucascauan.financeiro.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private final List<Usuario> usuarios = new ArrayList<>();
    public void adicionarUsuario(Usuario u) { usuarios.add(u); }
    public List<Usuario> listarUsuarios() { return new ArrayList<>(usuarios); }
}

