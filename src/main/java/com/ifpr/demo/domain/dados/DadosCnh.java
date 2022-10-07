package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.entidade.CNH;

import java.time.LocalDate;

public class DadosCnh {

    String numeroRegistro;
    LocalDate dataValidade;
    LocalDate dataPrimeiraHabilitacao;
    CategoriaCNH categoriaCNH;

    public DadosCnh(String numeroRegistro, LocalDate dataValidade, LocalDate dataPrimeiraHabilitacao, CategoriaCNH categoriaCNH) {
        this.numeroRegistro = numeroRegistro;
        this.dataValidade = dataValidade;
        this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
        this.categoriaCNH = categoriaCNH;
    }

    public CNH dadosToEntity() {
        return new CNH(numeroRegistro,
                dataValidade,
                dataPrimeiraHabilitacao,
                categoriaCNH);
    }






}
