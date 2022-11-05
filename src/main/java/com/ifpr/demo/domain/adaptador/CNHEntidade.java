package com.ifpr.demo.domain.adaptador;


import com.ifpr.demo.domain.dados.DadosCnh;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CNHEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_registro")
    private String numeroRegistro;

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    @Column(name = "data_primeira")
    private LocalDate dataPrimeiraHabilitacao;

    public CNHEntidade(DadosCnh dadosCnh) {
        this.numeroRegistro = dadosCnh.getNumeroRegistro();
        this.dataValidade = dadosCnh.getDataValidade();
        this.dataPrimeiraHabilitacao = dadosCnh.getDataPrimeiraHabilitacao();
    }

    public CNHEntidade() {

    }

    public DadosCnh toDadosCnh() {
        DadosCnh cnh = new DadosCnh(
                numeroRegistro,
                dataValidade,
                dataPrimeiraHabilitacao,
                null
        );
        return cnh;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
