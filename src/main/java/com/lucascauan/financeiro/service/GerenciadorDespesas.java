package com.lucascauan.financeiro.service;

import com.lucascauan.financeiro.model.*;
import com.lucascauan.financeiro.repository.RepositorioGastos;
import java.util.List;

public class GerenciadorDespesas {
    private final RepositorioGastos repo;
    public GerenciadorDespesas(RepositorioGastos repo) { this.repo = repo; }
    public Despesa registrarDespesa(String descricao, double valor, String dataISO, Categoria categoria) {
        java.time.LocalDate data;
        try { data = java.time.LocalDate.parse(dataISO); }
        catch (Exception e) { data = java.time.LocalDate.now(); }
        return new Despesa(repo.listarTodos().size()+1, descricao, valor, data, categoria);
    }
    public List<Gasto> listarDespesas() { return repo.listarTodos(); }
}

