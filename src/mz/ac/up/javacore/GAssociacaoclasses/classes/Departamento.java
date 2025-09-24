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
        return "Departamento{" +
                "pessoas=" + Arrays.toString(pessoas) +
                ", endereco=" + endereco +
                '}';
    }
}
