package com.ifpr.demo.domain.erro;

public class ErroGenerico extends Exception {
    public ErroGenerico(String errorMessage) {
        super(errorMessage);
    }
}