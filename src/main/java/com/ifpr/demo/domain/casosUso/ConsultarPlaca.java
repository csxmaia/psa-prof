package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCarro;
import com.ifpr.demo.domain.portas.ConsultaVeiculo;

public class ConsultarPlaca {
    DadosCarro dadosCarro;
    ConsultaVeiculo api;

    public ConsultarPlaca() {
    }

    public DadosCarro buscarPelaPlaca(String placa) {
        DadosCarro dadosCarro = (DadosCarro) api.consultarPlaca(placa);
        return dadosCarro;
    }

    public DadosCarro buscarPeloRenavam(String renavam) {
        DadosCarro dadosCarro = (DadosCarro) api.consultarRenavam(renavam);
        return dadosCarro;
    }

    public DadosCarro buscarPeloChassis(String chassis) {
        DadosCarro dadosCarro = (DadosCarro) api.consultarChassis(chassis);
        return dadosCarro;
    }

}
