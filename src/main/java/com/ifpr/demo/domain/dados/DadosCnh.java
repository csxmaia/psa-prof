package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.dados.enums.DadosCategoriaCNHEnum;
import com.ifpr.demo.domain.entidade.CNH;

import java.time.LocalDate;

public class DadosCnh {

    String numeroRegistro;
    LocalDate dataValidade;
    LocalDate dataPrimeiraHabilitacao;
    DadosCategoriaCNHEnum dadosCategoriaCNHEnum;

    public DadosCnh(String numeroRegistro, LocalDate dataValidade, LocalDate dataPrimeiraHabilitacao, DadosCategoriaCNHEnum dadosCategoriaCNHEnum) {
        this.numeroRegistro = numeroRegistro;
        this.dataValidade = dataValidade;
        this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
        this.dadosCategoriaCNHEnum = dadosCategoriaCNHEnum;
    }

    public CNH toEntity() {
        return new CNH(numeroRegistro,
                dataValidade,
                dataPrimeiraHabilitacao,
                dadosCategoriaCNHEnum);
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrimeiraHabilitacao() {
        return dataPrimeiraHabilitacao;
    }

    public void setDataPrimeiraHabilitacao(LocalDate dataPrimeiraHabilitacao) {
        this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
    }

    public DadosCategoriaCNHEnum getCategoriaCNH() {
        return dadosCategoriaCNHEnum;
    }

    public void setCategoriaCNH(DadosCategoriaCNHEnum dadosCategoriaCNHEnum) {
        this.dadosCategoriaCNHEnum = dadosCategoriaCNHEnum;
    }
}
