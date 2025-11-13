package com.lucascauan.financeiro.model;

import java.time.LocalDate;

public class Despesa extends Gasto {
    private boolean fixa;
    private boolean paga;

    public Despesa(int id, String descricao, double valor, LocalDate data, Categoria categoria) {
        super(id, descricao, valor, data, categoria);
        this.fixa = false;
        this.paga = false;
    }

    public boolean isFixa() {
        return fixa;
    }

    public void setFixa(boolean fixa) {
        this.fixa = fixa;
    }

    public boolean isPaga() {
        return paga;
    }

    public void marcarComoPaga() {
        this.paga = true;
    }

    public double calcularComJuros(double percentual) {
        return getValor() * (1 + percentual / 100.0);
    }

    public String detalhar() {
        return String.format("Despesa: %s | Valor: R$ %.2f | Data: %s | Categoria: %s | Fixa: %s | Paga: %s", getDescricao(), getValor(), getData(), getCategoria(), fixa ? "Sim" : "Não", paga ? "Sim" : "Não");
    }
    // Você pode adicionar métodos específicos de despesa aqui
}
