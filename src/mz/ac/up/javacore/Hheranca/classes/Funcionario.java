package mz.ac.up.javacore.Hheranca.classes;

import mz.ac.up.javacore.GAssociacaoclasses.classes.Endereco;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Pessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, char genero, String identidade, Endereco[] enderecos, String cargo, double salario) {
        super(nome, idade, genero, identidade, enderecos);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
@Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario + "Mt.");
    }

    public void exemplo(){};
}
