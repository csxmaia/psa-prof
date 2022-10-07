package com.ifpr.demo.domain.portas;

import com.ifpr.demo.domain.dados.DadosEmail;

public interface EnviarEmail {
  boolean enviar(DadosEmail dadosEmail);
}
