package com.ifpr.demo.domain.erro;

public class DadosInconsistentes extends ErroGenerico {
    public DadosInconsistentes(String errorMessage) {
        super("Dados inconsistentes com o DENATRAN!");
    }
}