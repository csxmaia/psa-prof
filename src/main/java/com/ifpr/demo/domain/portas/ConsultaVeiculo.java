package com.ifpr.demo.domain.portas;

public interface ConsultaVeiculo {
    Object consultarPlaca(String placa);
    Object consultarRenavam(String renavam);
    Object consultarChassis(String chassis);
}
