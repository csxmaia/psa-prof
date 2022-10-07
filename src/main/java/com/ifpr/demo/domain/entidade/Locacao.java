package com.ifpr.demo.domain.entidade;

import com.ifpr.demo.domain.dados.DadosCarro;
import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.dados.DadosLocacao;


import java.util.Date;

public class Locacao {

    Carro carro;
    Cliente cliente;
    Date dataLocacao;
    double quilometragemLocacao;
    double valorCalcao;
    double valorLocacao;
    boolean devolvido;
    Date dataDevolucao;
    double quilometragemDevolucao;


    public Locacao(Carro carro,
                   Cliente cliente,
                   Date dataLocacao,
                   double quilometragemLocacao,
                   double valorCalcao,
                   double valorLocacao,
                   boolean devolvido,
                   Date dataDevolucao,
                   double quilometragemDevolucao) {
        this.carro = carro;
        this.cliente = cliente;
        this.dataLocacao = dataLocacao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
        this.dataDevolucao = dataDevolucao;
        this.quilometragemDevolucao = quilometragemDevolucao;
    }


    public void cadastrar(DadosLocacao dadosLocacao) {


        DadosCarro carro = dadosLocacao.getCarro();
        DadosCliente cliente = dadosLocacao.getCliente();
        Date dataLocacao = dadosLocacao.getDataLocacao();
        double quilometragemLocacao = dadosLocacao.getQuilometragemLocacao();
        double valorCalcao = dadosLocacao.getValorCalcao();

        boolean devolvido = dadosLocacao.getDevolvido();
        Date dataDevolucao = dadosLocacao.getDataDevolucao();
        double quilometragemDevolucao = dadosLocacao.getQuilometragemDevolucao();

        valorLocacao = calcularValorFinal(cliente, carro);

        this.carro = carro.dadosToEntity();
        this.cliente = cliente.dadosToEntity();
        this.dataLocacao = dataLocacao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
        this.dataDevolucao = dataDevolucao;
        this.quilometragemDevolucao = quilometragemDevolucao;
    }

    // desconto com base no tempo de cnh (Exemplo: 0,5% de desconto por ano de cnh)
    private double calcularValorFinal(DadosCliente dadosCliente, DadosCarro dadosCarro) {

        Cliente cliente = dadosCliente.dadosToEntity();
        Carro carro = dadosCarro.dadosToEntity();

        int anosDeCnh = cliente.getCnh().anosDeCnh();
        double valorBase = carro.valorBaseLocacao;

        double valorFinal = valorBase - valorBase * (0.5 * anosDeCnh);

        return valorFinal;
    }
}
