package com.ifpr.demo.domain.dados;

public enum TipoCombustivelEnum {

    FLEX(1),
    DIESEL(2),
    ETANOL(3),
    GASOLINA(4),
    GNV(5);

    private int valor;

    TipoCombustivelEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
