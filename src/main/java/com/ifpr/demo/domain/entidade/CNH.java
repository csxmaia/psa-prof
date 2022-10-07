package com.ifpr.demo.domain.entidade;

import com.ifpr.demo.domain.dados.CategoriaCNH;
import com.ifpr.demo.domain.dados.DadosCnh;

import java.time.LocalDate;
import java.util.Date;

public class CNH {

    String numeroRegistro;
    LocalDate dataValidade;
    LocalDate dataPrimeiraHabilitacao;
    CategoriaCNH categoriaCNH;

    public CNH(String numeroRegistro, LocalDate dataValidade,
               LocalDate dataPrimeiraHabilitacao, CategoriaCNH categoriaCNH) {
        this.numeroRegistro = numeroRegistro;
        this.dataValidade = dataValidade;
        this.dataPrimeiraHabilitacao = dataPrimeiraHabilitacao;
        this.categoriaCNH = categoriaCNH;
    }

    public DadosCnh dadosToDadosCNH() {
        return new DadosCnh(numeroRegistro,
                dataValidade,
                dataPrimeiraHabilitacao,
                categoriaCNH);
    }

    public boolean validarCNH() {
        return validarTamanho() && validaCategoria()
                && validarDataValidade() && validarDataPrimeiraHabilitacao();
    }


    private boolean validarTamanho() {
        return numeroRegistro.length() == 11;
    }


    private boolean validarDataPrimeiraHabilitacao() {
        LocalDate dataAtual = LocalDate.now();

        LocalDate dataPrimeiraHab = dataPrimeiraHabilitacao;

        dataPrimeiraHab.plusYears(2);

        if (dataAtual.isAfter(dataPrimeiraHab)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean validarDataValidade() {

        LocalDate dataAtual = LocalDate.now();

        if (dataAtual.isAfter(dataValidade)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaCategoria() {
        return categoriaCNH.getValor() != 1;
    }

    public int anosDeCnh() {
        LocalDate dataAtual = LocalDate.now();
        int anos = dataAtual.getYear() - dataPrimeiraHabilitacao.getYear();
        return anos;
    }

}
