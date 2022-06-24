package br.ufpe.cin;

import java.util.UUID;

public class CadastroConta {
  public Conta criarConta(Pessoa titular) {
    final Conta conta = new Conta(UUID.randomUUID(), titular);
    return conta;
  }
}
