package mz.ac.up.javacore.GAssociacaoclasses.classes;

import java.util.Arrays;

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private String identidade;
    private Endereco[] enderecos;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char genero, String identidade, Endereco[] enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.identidade = identidade;
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero=" + genero +
                ", identidade='" + identidade + '\'' +
                ", enderecos=" + Arrays.toString(enderecos) +
                '}';
    }
}
