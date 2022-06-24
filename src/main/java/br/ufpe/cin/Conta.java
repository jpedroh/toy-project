package br.ufpe.cin;

import java.util.UUID;

public class Conta {
  private UUID codigo;
  private Pessoa titular;
  
  public Conta(UUID codigo, Pessoa titular) {
    this.codigo = codigo;
    this.titular = titular;
  }

  public UUID getCodigo() {
    return codigo;
  }

  public Pessoa getTitular() {
    return titular;
  }
}
