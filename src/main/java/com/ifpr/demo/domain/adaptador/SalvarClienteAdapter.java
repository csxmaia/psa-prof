package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.dados.DadosCliente;

public class SalvarClienteAdapter {

    ClienteRepository clienteRepository;

    public DadosCliente salvarNoBancoDeDados(DadosCliente dadosCliente) {
        ClienteEntidade clienteEntidade = new ClienteEntidade(dadosCliente);
        clienteRepository.save(clienteEntidade);
        DadosCliente cliente = clienteEntidade.toDadosCliente();
        return cliente;
    }
}
