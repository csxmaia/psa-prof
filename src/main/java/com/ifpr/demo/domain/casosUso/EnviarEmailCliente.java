package com.ifpr.demo.domain.casosUso;

import org.springframework.beans.factory.annotation.Autowired;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.dados.DadosEmail;
import com.ifpr.demo.domain.portas.EnviarEmail;

public class EnviarEmailCliente {
    DadosCliente dadosCliente;

    @Autowired
    EnviarEmail email;

    EnviarEmailCliente(DadosCliente dadosCliente) {
        this.dadosCliente = dadosCliente;
    }

    boolean enviarEmail(String assunto, String conteudo) {
        DadosEmail dadosEmail = new DadosEmail();
        dadosEmail.setAssunto(assunto);
        dadosEmail.setConteudo(conteudo);
        dadosEmail.setDestinatario(this.dadosCliente.getEmail());

        boolean sucessoAoEnviar = email.enviar(dadosEmail);
        
        return sucessoAoEnviar;
    }
}


