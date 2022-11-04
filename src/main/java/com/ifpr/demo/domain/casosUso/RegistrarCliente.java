package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.entidade.Cliente;
import com.ifpr.demo.domain.erro.CnhInvalida;
import com.ifpr.demo.domain.erro.IdadeNaoPermitida;
import com.ifpr.demo.domain.portas.ClienteRepositorio;
import com.ifpr.demo.domain.portas.EnviarEmail;

public class RegistrarCliente {
    DadosCliente dadosCliente;
    Cliente cliente;
    ClienteRepositorio repositorio;
    EnviarEmail email;

    RegistrarCliente(DadosCliente dadosCliente) throws IdadeNaoPermitida, CnhInvalida {
        Cliente.cadastrar(dadosCliente);
        NotificarCliente notificarCliente = new NotificarCliente(dadosCliente);
        if (repositorio.salvar(dadosCliente)) {
            notificarCliente.enviarEmail();
        }
    }
}
