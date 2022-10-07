package com.ifpr.demo.domain.erro;

public class IdadeNaoPermitida extends ErroGenerico {
    public IdadeNaoPermitida(String errorMessage) {
        super("Idade não permitida, você possui menos de 21 anos!");
    }
}