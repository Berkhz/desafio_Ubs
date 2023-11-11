package com.ubsdigital.source.models.domain;

import com.ubsdigital.source.models.domain.services.Servicos;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente implements Servicos {
    private String nomePaciente;
    private int idade;
    private char sexo;
    private String rua;
    private int cep;
    private String bairro;
    private String cidade;
    private String estado;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPaciente;
    private int codigoUsuario;
    private String nomeCartao;
    private Date dataNascimento;
    private String nomeMae;
    private int rg;
    private Date dataExpedicaoRg;
    private int cpf;
    private int numeroCNS;
    private int telefone;
    private int cnpj;
    private int ie;
    private int pacienteTipo;

    public Paciente(String nomePaciente, int idade, char sexo, String rua, int cep, String bairro, String cidade,
                    String estado, int idPaciente, int codigoUsuario, String nomeCartao, Date dataNascimento,
                    String nomeMae, int rg, Date dataExpedicaoRg, int cpf, int numeroCNS, int telefone, int cnpj,
                    int ie, int pacienteTipo) {
        this.nomePaciente = nomePaciente;
        this.idade = idade;
        this.sexo = sexo;
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.idPaciente = idPaciente;
        this.codigoUsuario = codigoUsuario;
        this.nomeCartao = nomeCartao;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.rg = rg;
        this.dataExpedicaoRg = dataExpedicaoRg;
        this.cpf = cpf;
        this.numeroCNS = numeroCNS;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.ie = ie;
        this.pacienteTipo = pacienteTipo;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Date getDataExpedicaoRg() {
        return dataExpedicaoRg;
    }

    public void setDataExpedicaoRg(Date dataExpedicaoRg) {
        this.dataExpedicaoRg = dataExpedicaoRg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumeroCNS() {
        return numeroCNS;
    }

    public void setNumeroCNS(int numeroCNS) {
        this.numeroCNS = numeroCNS;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getIe() {
        return ie;
    }

    public void setIe(int ie) {
        this.ie = ie;
    }

    public int getPacienteTipo() {
        return pacienteTipo;
    }

    public void setPacienteTipo(int pacienteTipo) {
        this.pacienteTipo = pacienteTipo;
    }

    @Override
    public String agendarConsulta(Date data) throws Exception {
        return null;
    }

    @Override
    public String aplicarVacina(Integer vacina) {
        return null;
    }

    @Override
    public String agendaExames(Date data) throws Exception {
        return null;
    }

    @Override
    public String solicitaMedicamento(String nomeMedicamento, String dataRecolhimento) throws Exception {
        return null;
    }
}