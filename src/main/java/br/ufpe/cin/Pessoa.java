package br.ufpe.cin;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa 
{
    private String cpf;
    private String nome;
    private String sobrenome;
    private Instant dataNascimento;
    
    public Pessoa(String cpf, String nome, String sobrenome, Instant dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Instant getDataNascimento() {
        return dataNascimento;
    }

    public boolean isMaiorIdade() {
        final Instant eighteenYearsAgo = Instant.now().minus(18, ChronoUnit.YEARS);
        
        return this.dataNascimento.isAfter(eighteenYearsAgo);
    }
}
