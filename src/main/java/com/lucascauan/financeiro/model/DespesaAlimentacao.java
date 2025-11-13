package com.lucascauan.financeiro.model;

public class DespesaAlimentacao extends Despesa {
    public DespesaAlimentacao(int id, String descricao, double valor, java.time.LocalDate data) {
        super(id, descricao, valor, data, Categoria.ALIMENTACAO);
    }
}

