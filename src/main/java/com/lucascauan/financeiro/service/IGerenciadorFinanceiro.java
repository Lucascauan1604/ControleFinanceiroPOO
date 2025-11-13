package com.lucascauan.financeiro.service;

import com.lucascauan.financeiro.model.Gasto;
import com.lucascauan.financeiro.model.Categoria;
import java.util.List;

public interface IGerenciadorFinanceiro {
    Gasto registrarGasto(String descricao, double valor, String dataISO, Categoria categoria);
    List<Gasto> listarGastos();
    boolean removerGasto(int id);
    List<Gasto> listarPorCategoria(Categoria categoria);
    double totalGastos();
    double mediaGastos();
}
