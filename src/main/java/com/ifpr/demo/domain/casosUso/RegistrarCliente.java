package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.entidade.Cliente;
import com.ifpr.demo.domain.erro.CnhInvalida;
import com.ifpr.demo.domain.erro.IdadeNaoPermitida;

public class RegistrarCliente {
    SalvarCliente salvarCliente;
    Cliente cliente;

    RegistrarCliente(DadosCliente dadosCliente) throws IdadeNaoPermitida, CnhInvalida {
        cliente.cadastrar(dadosCliente);
        NotificarCliente notificarCliente = new NotificarCliente(dadosCliente);

        if (salvarCliente.save(dadosCliente)) {
            notificarCliente.enviarEmailBoasVindas(dadosCliente);
        }
    }
}
