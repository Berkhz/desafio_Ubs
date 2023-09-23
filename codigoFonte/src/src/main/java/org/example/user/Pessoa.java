package org.example.user;

abstract public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;
    private Long telefone;

    public Pessoa(String nome, Integer idade, String sexo, Integer telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = Long.valueOf(telefone);
    }
}
