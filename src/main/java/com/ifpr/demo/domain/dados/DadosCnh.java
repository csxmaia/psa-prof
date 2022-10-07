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

    public CategoriaCNH getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(CategoriaCNH categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }
}
