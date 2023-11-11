package com.ubsdigital.source.models.domain;

abstract public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;
    private Long telefone;
    private Integer vacina;

    public Pessoa(String nome, Integer idade, String sexo, Integer telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = Long.valueOf(telefone);
    }
}