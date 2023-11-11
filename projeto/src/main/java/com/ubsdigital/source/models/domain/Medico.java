package com.ubsdigital.source.models.domain;

public class Medico extends Pessoa {
    private Integer codMedico;
    public Medico(String nome, Integer idade, String sexo, Integer telefone, Integer codMedico) {
        super(nome, idade, sexo, telefone);
        this.codMedico = codMedico;
    }

    public Integer getCodMedico() {
        return codMedico;
    }
}