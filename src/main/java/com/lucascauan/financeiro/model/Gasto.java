package com.lucascauan.financeiro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gasto {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private int id;
    private String descricao;
    private double valor;
    private LocalDate data;
    private Categoria categoria;

    public Gasto(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public double getValor() { return valor; }
    public LocalDate getData() { return data; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public String toString() {
        return String.format("[%d] %s — R$ %.2f — %s — %s", id, descricao, valor, data.format(fmt), categoria);
    }
}
