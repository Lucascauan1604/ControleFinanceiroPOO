package com.lucascauan.financeiro.app;

import com.lucascauan.financeiro.model.Categoria;
import com.lucascauan.financeiro.model.Gasto;
import com.lucascauan.financeiro.repository.RepositorioGastos;
import com.lucascauan.financeiro.service.GerenciadorFinanceiro;
import com.lucascauan.financeiro.service.IGerenciadorFinanceiro;

import java.util.List;
import java.util.Scanner;

public class AppFinanceira {
    private final IGerenciadorFinanceiro ger;
    private final Scanner sc = new Scanner(System.in);

    public AppFinanceira(IGerenciadorFinanceiro ger) { this.ger = ger; }

    public void start() {
        boolean rodando = true;
        while (rodando) {
            mostrarMenu();
            String opc = sc.nextLine().trim();
            switch (opc) {
                case "1": cadastrar(); break;
                case "2": listar(); break;
                case "3": remover(); break;
                case "4": listarPorCategoria(); break;
                case "5": resumo(); break;
                case "0": rodando = false; System.out.println("Saindo... até logo!"); break;
                default: System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n=== GERENCIADOR FINANCEIRO (Console) ===");
        System.out.println("1 - Registrar gasto");
        System.out.println("2 - Listar gastos");
        System.out.println("3 - Remover gasto por ID");
        System.out.println("4 - Listar por categoria");
        System.out.println("5 - Resumo (total e média)");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private void cadastrar() {
        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        System.out.print("Valor (ex: 45.50): ");
        double val = lerDouble();
        System.out.print("Data (yyyy-MM-dd) ou enter para hoje: ");
        String data = sc.nextLine().trim();
        if (data.isEmpty()) data = java.time.LocalDate.now().toString();
        System.out.print("Categoria (alimentacao, transporte, lazer, saude, moradia, outros): ");
        String cat = sc.nextLine();
        Gasto g = ger.registrarGasto(desc, val, data, Categoria.fromString(cat));
        System.out.println("Gasto registrado: " + g);
    }

    private double lerDouble() {
        while (true) {
            try {
                String s = sc.nextLine().replace(',', '.').trim();
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Digite novamente: ");
            }
        }
    }

    private void listar() {
        List<Gasto> list = ger.listarGastos();
        if (list.isEmpty()) { System.out.println("Nenhum gasto registrado."); return; }
        System.out.println("\n--- Lista de gastos ---");
        list.forEach(System.out::println);
    }

    private void remover() {
        System.out.print("ID do gasto a remover: ");
        try {
            int id = Integer.parseInt(sc.nextLine().trim());
            boolean ok = ger.removerGasto(id);
            System.out.println(ok ? "Removido com sucesso." : "ID não encontrado.");
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
        }
    }

    private void listarPorCategoria() {
        System.out.print("Categoria: ");
        String c = sc.nextLine();
        List<Gasto> list = ger.listarPorCategoria(Categoria.fromString(c));
        if (list.isEmpty()) System.out.println("Nenhum gasto nessa categoria.");
        else list.forEach(System.out::println);
    }

    private void resumo() {
        double total = ger.totalGastos();
        double media = ger.mediaGastos();
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Média por gasto: R$ %.2f\n", media);
    }

    public static void main(String[] args) {
        RepositorioGastos repo = new RepositorioGastos();
        IGerenciadorFinanceiro ger = new GerenciadorFinanceiro(repo);
        AppFinanceira app = new AppFinanceira(ger);
        app.start();
    }
}
