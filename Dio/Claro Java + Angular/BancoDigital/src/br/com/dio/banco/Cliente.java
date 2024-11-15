package br.com.dio.banco;
import java.util.List;
import java.util.Set;

public class Cliente {
    private String nome;
    private String endereco;
    private List<Conta> contas;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
