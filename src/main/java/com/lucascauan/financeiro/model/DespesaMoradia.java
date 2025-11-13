package com.lucascauan.financeiro.model;

public class DespesaMoradia extends Despesa {
    public DespesaMoradia(int id, String descricao, double valor, java.time.LocalDate data) {
        super(id, descricao, valor, data, Categoria.MORADIA);
    }
}

