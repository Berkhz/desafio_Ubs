package org.example.services;

import java.util.Date;

public class Examina {
    private Date dataConsulta;
    private Date horarioConsulta;

    public Examina(Date dataConsulta, Date horarioConsulta) {
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public Date getHorarioConsulta() {
        return horarioConsulta;
    }
}
