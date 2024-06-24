package Dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Endereco;

public class EnderecoDao {

    public static List<Endereco> lerEnderecos(String filePath) throws IOException {
        List<Endereco> enderecos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String rua = dados[0];
                String cidade = dados[1];
                int codigoPessoa = Integer.parseInt(dados[2]);
                enderecos.add(new Endereco(rua, cidade, codigoPessoa));
            }
        }
        return enderecos;
    }

    
}
