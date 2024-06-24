package br.edu.up.models;

public class PessoaComEndereco {
    private Pessoa pessoa;
    private Endereco endereco;

    public PessoaComEndereco(Pessoa pessoa, Endereco endereco) {
        this.pessoa = pessoa;
        this.endereco = endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String toCsv() {
        return pessoa.getCodigo() + "," + pessoa.getNome() + "," + endereco.getRua() + "," + endereco.getCidade();
    }

    @Override
    public String toString() {
        return pessoa + "," + endereco;
    }
}
