package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.dados.DadosEmail;
import com.ifpr.demo.domain.portas.EnviarEmail;

public class EnviarEmailAdapter implements EnviarEmail {
    private String username = "user@gmail.com";
    private String password = "123123";

    @Override
    public boolean enviar(DadosEmail dadosEmail) {
        // Implementação do envio de email
        // Implementação do envio de email
        // Implementação do envio de email
        // Implementação do envio de email
        if(true) {
            return true;
        }
        return false;
    }
    
}