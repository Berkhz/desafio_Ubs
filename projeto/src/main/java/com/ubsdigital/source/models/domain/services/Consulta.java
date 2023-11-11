package com.ubsdigital.source.models.domain.services;

import java.util.Date;

public class Consulta {

    private String paciente;
    private Date data;

    public Consulta(String paciente, Date data) {
        this.paciente = paciente;
        this.data = data;
    }

    public String getPaciente() {
        return paciente;
    }

    public Date getData() {
        return data;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setData(Date data) {
        this.data = data;
    }
}