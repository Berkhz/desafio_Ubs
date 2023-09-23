package org.example.address;

public class Endereco {
    private String rua;
    private Integer cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, Integer cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public Integer getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
