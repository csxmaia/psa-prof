package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.entidade.Cliente;
import com.ifpr.demo.domain.erro.CnhInvalida;
import com.ifpr.demo.domain.erro.IdadeNaoPermitida;
import com.ifpr.demo.domain.portas.ClienteRepositorio;

public class SalvarCliente {
    DadosCliente dadosCliente;
    Cliente cliente;
    EnviarEmailCliente enviarEmailCliente;
    ClienteRepositorio clienteRepositorio;

    SalvarCliente(DadosCliente dadosCliente) throws IdadeNaoPermitida, CnhInvalida {
        Cliente cliente = new Cliente();
        cliente.cadastrar(dadosCliente);

        EnviarEmailCliente enviarEmailCliente = new EnviarEmailCliente(dadosCliente);
        if (clienteRepositorio.salvar(dadosCliente)) {
        	enviarEmailCliente.enviarEmail("Boas vindas", "Seja bem vindo!");
        }
    }
}


