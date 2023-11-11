package com.ubsdigital.source.models.domain.validation;

import java.util.Date;

public class CartaoSUS {
    private String nomeCartao;
    private Date dataNascimento;
    private String nomeMae;
    private Integer RG;
    private Date dataExpedicaoRG;
    private Integer CPF;
    private Integer numeroCNS;

    public CartaoSUS(String nomeCartao, Date dataNascimento, String nomeMae, Integer RG, Date dataExpedicaoRG, Integer CPF, Integer numeroCNS) {
        this.nomeCartao = nomeCartao;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.RG = RG;
        this.dataExpedicaoRG = dataExpedicaoRG;
        this.CPF = CPF;
        this.numeroCNS = numeroCNS;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public Integer getRG() {
        return RG;
    }

    public Date getDataExpedicaoRG() {
        return dataExpedicaoRG;
    }

    public Integer getCPF() {
        return CPF;
    }

    public Integer getNumeroCNS() {
        return numeroCNS;
    }
}