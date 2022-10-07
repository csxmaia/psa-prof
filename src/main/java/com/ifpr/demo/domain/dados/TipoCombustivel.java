package com.ifpr.demo.domain.dados;

public enum TipoCombustivel {

    FLEX(1),
    DIESEL(2),
    ETANOL(3),
    GASOLINA(4),
    GNV(5);

    private int valor;

    TipoCombustivel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
