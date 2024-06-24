import java.io.*;
import java.util.*;

import Dao.EnderecoDao;
import Dao.PessoaDao;
import br.edu.up.models.*;

public class Program {
    public static void main(String[] args) {
        try {
            List<Pessoa> pessoas = PessoaDao.lerPessoas("dbBanco/Pessoas.csv");
            List<Endereco> enderecos = EnderecoDao.lerEnderecos("dbBanco/Enderecos.csv");

            List<PessoaComEndereco> pessoasComEnderecos = new ArrayList<>();
            for (Pessoa pessoa : pessoas) {
                for (Endereco endereco : enderecos) {
                    if (pessoa.getCodigo() == endereco.getCodigoPessoa()) {
                        pessoasComEnderecos.add(new PessoaComEndereco(pessoa, endereco));
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("PessoasComEndereco.csv"))) {
                for (PessoaComEndereco pessoaComEndereco : pessoasComEnderecos) {
                    writer.write(pessoaComEndereco.toCsv());
                    writer.newLine();
                }
            }

            System.out.println("Arquivo PessoasComEndereco.csv gerado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
