package com.ifpr.demo.domain.dados;

public enum CategoriaCNH {

    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    AB(6),
    AC(7),
    AD(8),
    AE(9);

    private int valor;

    CategoriaCNH(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
