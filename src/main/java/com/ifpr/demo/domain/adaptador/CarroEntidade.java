package com.ifpr.demo.domain.adaptador;

import javax.persistence.*;

import com.ifpr.demo.domain.dados.DadosCarro;
import com.ifpr.demo.domain.dados.enums.DadosTipoCombustivelEnum;

@Entity
public class CarroEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "modelo")
    private String modelo;

    @Column(name = "valor_base_locacao")
    private double valorBaseLocacao;

    @Column(name = "quilometragem")
    private int quilometragem;

    @Column(name = "ano_fabricacao")
    private int anoFabricacao;

    @Column(name = "ano_modelo")
    private int anoModelo;

    @Column(name = "placa")
    private String placa;

    @Column(name = "renavam")
    private int renavam;

    @Column(name = "chassis")
    private String chassis;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "tipo_combustivel_id")
    private DadosTipoCombustivelEnum tipoCombustivel;

    @Column(name = "potencia_cv")
    private int potenciaCv;

    @Column(name = "disponivel")
    private boolean disponivel;

    public CarroEntidade() {

    }

    public CarroEntidade(DadosCarro dadosCarro) {
        this.modelo = dadosCarro.getModelo();
        this.valorBaseLocacao = dadosCarro.getValorBaseLocacao();
        this.quilometragem = dadosCarro.getQuilometragem();
        this.anoFabricacao = dadosCarro.getAnoFabricacao();
        this.anoModelo = dadosCarro.getAnoFabricacao();
        this.placa = dadosCarro.getPlaca();
        this.renavam = dadosCarro.getRenavam();
        this.chassis = dadosCarro.getChassis();
        this.categoria = dadosCarro.getCategoria();
        this.tipoCombustivel = dadosCarro.getTipoCombustivel();
        this.potenciaCv = dadosCarro.getPotenciaCv();
        this.disponivel = dadosCarro.getDisponivel();
    }

    public DadosCarro toDadosCarro() {
        DadosCarro carro = new DadosCarro(
                modelo,
                valorBaseLocacao,
                quilometragem,
                anoFabricacao,
                anoModelo,
                placa,
                renavam,
                chassis,
                categoria,
                tipoCombustivel,
                potenciaCv,
                disponivel
        );
        return carro;
    }
}
