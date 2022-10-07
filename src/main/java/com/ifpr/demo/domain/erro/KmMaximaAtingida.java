package com.ifpr.demo.domain.erro;

public class KmMaximaAtingida extends ErroGenerico {
    public KmMaximaAtingida(String errorMessage) {
        super("Carro excedeu a quilometragem máxima permitida!");
    }
}