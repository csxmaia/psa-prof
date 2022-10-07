package com.ifpr.demo.domain.portas;

import java.util.List;

public interface CarroRepositorio {
  boolean salvar(Object dadosCarro);
  boolean existe(Object dadosCarro);
  void excluir(int id);
  List<Object> listar();
  Object buscar(int id);
}
