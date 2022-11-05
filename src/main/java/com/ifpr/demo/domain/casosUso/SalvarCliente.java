package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.entidade.Cliente;
import com.ifpr.demo.domain.erro.CnhInvalida;
import com.ifpr.demo.domain.erro.IdadeNaoPermitida;
import com.ifpr.demo.domain.portas.ClienteRepositorio;

public class SalvarCliente {
    ClienteRepositorio clienteRepositorio;

    boolean save(DadosCliente dadosCliente) {
        return clienteRepositorio.salvar(dadosCliente);
    }
}


