package com.ifpr.demo.domain.dados.enums;

import com.ifpr.demo.domain.dados.TipoCombustivelEnum;

public enum DadosTipoCombustivelEnum {

    FLEX(1),
    DIESEL(2),
    ETANOL(3),
    GASOLINA(4),
    GNV(5);

    private int valor;

    DadosTipoCombustivelEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public TipoCombustivelEnum toTipoCombustivelEnum() {
        TipoCombustivelEnum tipoCombustivelEnum = TipoCombustivelEnum.FLEX;
        tipoCombustivelEnum.setValor(this.valor);
        return tipoCombustivelEnum;
    }

}
