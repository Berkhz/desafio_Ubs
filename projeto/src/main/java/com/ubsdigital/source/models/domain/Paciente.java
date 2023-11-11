package com.ubsdigital.source.models.domain;

import com.ubsdigital.source.models.domain.services.Consulta;
import com.ubsdigital.source.models.domain.services.Servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends Pessoa implements Servicos {
    public Paciente(String nome, Integer idade, String sexo, Integer telefone) {
        super(nome, idade, sexo, telefone);
    }

    public void FormataCPF() {

    }

    public void FormataRG() {

    }

    @Override
    public String agendarConsulta(Date data) throws Exception {
        String pacienteNome = "Arnaldo";
        String dataString = "28-09-2023";

        Date dataConsulta = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dataConsulta = dateFormat.parse(dataString);
        } catch (ParseException e) {
            throw new Exception("Erro ao converter a data: " + e.getMessage(), e);
        }

        Consulta consulta = new Consulta(pacienteNome, dataConsulta);
        return "Consulta agendada para o dia " + consulta.getData() + " para o paciente " + consulta.getPaciente();
    }

    @Override
    public String aplicarVacina(Integer vacina) {
        vacina += 1;
        return "Você tomou vacina \n" +
                "Total: " + vacina + " vacinas aplicadas.";
    }

    @Override
    public String agendaExames(Date data) throws Exception {
        String pacienteNome = "Patrícia";
        String dataString = "02-10-2023";

        Date dataConsulta = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dataConsulta = dateFormat.parse(dataString);
        } catch (ParseException e) {
            throw new Exception("Erro ao converter a data: " + e.getMessage(), e);
        }

        Consulta consulta = new Consulta(pacienteNome, dataConsulta);
        return "Exame agendado para o dia " + consulta.getData() + " para o paciente " + consulta.getPaciente();
    }

    @Override
    public String solicitaMedicamento(String nomeMedicamento, String dataRecolhimento) throws Exception {
        nomeMedicamento = "Rivotril";
        dataRecolhimento = "06-10-2023";

        Date dataConsulta = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dataConsulta = dateFormat.parse(dataRecolhimento);
        } catch (ParseException e) {
            throw new Exception("Erro ao converter a data: " + e.getMessage(), e);
        }

        return "Você solicitou" + nomeMedicamento + "\n " +
                "Retirada para o dia: " + dataRecolhimento;
    }
}