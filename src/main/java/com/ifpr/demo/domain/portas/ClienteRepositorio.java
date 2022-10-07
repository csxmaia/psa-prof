package com.ifpr.demo.domain.portas;

import com.ifpr.demo.domain.dados.DadosCliente;

public interface ClienteRepositorio {
    boolean salvar(DadosCliente dadosCliente);
}
