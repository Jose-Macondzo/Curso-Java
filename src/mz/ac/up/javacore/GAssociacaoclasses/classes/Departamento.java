package mz.ac.up.javacore.GAssociacaoclasses.classes;

import java.util.Arrays;

public class Departamento {
    private Pessoa[] pessoas;
    private Endereco endereco;

    public Departamento() {
    }

    public Departamento(Pessoa[] pessoas, Endereco endereco) {
        this.pessoas = pessoas;
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("============================Departamento============================");
        System.out.println("Endereco do departamento: ");
        System.out.println("Cidade: " + endereco.getCidade() + "\nBairro: " + endereco.getBairro() + "\nRua: " + endereco.getRua());
        System.out.println("\n+++++++++++++++++++++++++++++++Pessoas no Departamento+++++++++++++++++++++++++++++++");

        for (Pessoa pessoa : pessoas) {
            System.out.println("---------------------------------------");
            System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nGenero: " + pessoa.getGenero() + "\nIdentificacao: " + pessoa.getIdentidade());
            System.out.println("Enderecos: ");

            for (Endereco endereco : pessoa.getEnderecos()) {
                System.out.println("Cidade: " + endereco.getCidade()+"\nBairro: "+endereco.getBairro()+"\nRua: "+endereco.getRua());
            }
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Departamento{" + "pessoas=" + Arrays.toString(pessoas) + ", endereco=" + endereco + '}';
    }
}
