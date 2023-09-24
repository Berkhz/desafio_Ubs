package org.example.services;

import java.util.Date;

public interface Servicos {

    String agendarConsulta(Date data) throws Exception;
    String aplicarVacina(Integer vacina);
    String agendaExames(Date data) throws Exception;
    String solicitaMedicamento(String nomeMedicamento, String dataRecolhimento) throws Exception;
}
