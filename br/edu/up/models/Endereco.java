package br.edu.up.models;

public class Endereco {

    private String rua;
    private String cidade;
    private int codigoPessoa;
    
    public Endereco(String rua, String cidade, int codigoPessoa) {
        this.rua = rua;
        this.cidade = cidade;
        this.codigoPessoa = codigoPessoa;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    @Override
    public String toString() {
        return rua + "," + cidade;
    }
}
    
    

