package Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Pessoa;

public class PessoaDao {

    public static List<Pessoa> lerPessoas(String arquivo) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int codigo = Integer.parseInt(dados[0]);
                String nome = dados[1];
                pessoas.add(new Pessoa(codigo, nome));
            }
        }
        return pessoas;
    }
    
}
