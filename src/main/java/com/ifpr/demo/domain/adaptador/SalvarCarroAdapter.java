package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.dados.DadosCarro;

public class SalvarCarroAdapter {

    CarroRepository carroRepository;

    public DadosCarro salvarNoBancoDeDados(DadosCarro dadosCarro) {
        CarroEntidade carroEntidade = new CarroEntidade(dadosCarro);
        carroRepository.save(carroEntidade);
        DadosCarro carro = carroEntidade.toDadosCarro();
        return carro;
    }
}
