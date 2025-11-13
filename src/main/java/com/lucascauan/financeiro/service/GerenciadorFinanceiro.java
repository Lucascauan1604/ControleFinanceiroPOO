package com.lucascauan.financeiro.service;

import com.lucascauan.financeiro.model.Categoria;
import com.lucascauan.financeiro.model.Gasto;
import com.lucascauan.financeiro.repository.RepositorioGastos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

public class GerenciadorFinanceiro implements IGerenciadorFinanceiro {
    private final RepositorioGastos repo;

    public GerenciadorFinanceiro(RepositorioGastos repo) { this.repo = repo; }

    @Override
    public Gasto registrarGasto(String descricao, double valor, String dataISO, Categoria categoria) {
        LocalDate data;
        try { data = LocalDate.parse(dataISO); }
        catch (DateTimeParseException e) { data = LocalDate.now(); }
        return repo.adicionar(descricao, valor, data, categoria);
    }

    @Override public List<Gasto> listarGastos() { return repo.listarTodos(); }
    @Override public boolean removerGasto(int id) { return repo.remover(id); }
    @Override public List<Gasto> listarPorCategoria(Categoria categoria) { return repo.filtrarPorCategoria(categoria); }
    @Override public double totalGastos() { return repo.somaTotal(); }
    @Override public double mediaGastos() { return repo.media(); }
}
