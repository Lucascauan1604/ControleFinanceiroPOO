package com.lucascauan.financeiro.repository;

import com.lucascauan.financeiro.model.Gasto;
import com.lucascauan.financeiro.model.Categoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepositorioGastos {
    private final List<Gasto> lista = new ArrayList<>();
    private int nextId = 1;

    public Gasto adicionar(String descricao, double valor, LocalDate data, Categoria cat) {
        Gasto g = new Gasto(nextId++, descricao, valor, data, cat);
        lista.add(g);
        return g;
    }

    public List<Gasto> listarTodos() { return new ArrayList<>(lista); }

    public Optional<Gasto> buscarPorId(int id) { return lista.stream().filter(g -> g.getId() == id).findFirst(); }

    public boolean remover(int id) { return lista.removeIf(g -> g.getId() == id); }

    public List<Gasto> filtrarPorCategoria(Categoria cat) {
        return lista.stream().filter(g -> g.getCategoria() == cat).collect(Collectors.toList());
    }

    public double somaTotal() { return lista.stream().mapToDouble(Gasto::getValor).sum(); }

    public double media() { return lista.isEmpty() ? 0.0 : somaTotal() / lista.size(); }
}
