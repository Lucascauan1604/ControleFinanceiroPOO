package com.lucascauan.financeiro.model;

public enum Categoria {
    ALIMENTACAO, TRANSPORTE, LAZER, SAUDE, MORADIA, OUTROS;

    public static Categoria fromString(String s) {
        if (s == null) return OUTROS;
        switch (s.trim().toLowerCase()) {
            case "alimentacao":
            case "alimentação":
            case "a":
                return ALIMENTACAO;
            case "transporte":
            case "t":
                return TRANSPORTE;
            case "lazer":
            case "l":
                return LAZER;
            case "saude":
            case "saúde":
            case "s":
                return SAUDE;
            case "moradia":
            case "m":
                return MORADIA;
            default:
                return OUTROS;
        }
    }
}
