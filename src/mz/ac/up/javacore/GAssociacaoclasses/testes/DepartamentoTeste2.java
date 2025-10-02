package mz.ac.up.javacore.GAssociacaoclasses.testes;

import mz.ac.up.javacore.GAssociacaoclasses.classes.Departamento;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Endereco;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Pessoa;

import java.util.Arrays;

public class DepartamentoTeste2 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setCidade("Matola");
        endereco1.setBairro("Matola A");
        endereco1.setRua("Rua passa a correr");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mauricio Chongola");
        pessoa1.setIdade(27);
        pessoa1.setGenero('M');
        pessoa1.setIdentidade("1324551313M");
        pessoa1.setEnderecos(new Endereco[]{endereco1});

        Endereco endereco2 = new Endereco();
        endereco2.setCidade("Matola");
        endereco2.setBairro("Malhampsene");
        endereco2.setRua("Rua das Araras");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jose Macondzo");
        pessoa2.setIdade(30);
        pessoa2.setGenero('M');
        pessoa2.setIdentidade("100116415161J");
        pessoa2.setEnderecos(new Endereco[]{endereco2});

        Endereco endereco3 = new Endereco();
        endereco3.setCidade("Matola");
        endereco3.setBairro("Fomento");
        endereco3.setRua("Rua das hortalicas");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Kelvia Maduela");
        pessoa3.setIdade(19);
        pessoa3.setGenero('F');
        pessoa3.setIdentidade("100115646541K");
        pessoa3.setEnderecos(new Endereco[]{endereco3});

        Endereco endereco4 = new Endereco();
        endereco4.setCidade("Maputo Cidade");
        endereco4.setBairro("Lhanguene");
        endereco4.setRua("Avenida de Mocambique");

        Pessoa[] pessoas = new Pessoa[]{pessoa1, pessoa2, pessoa3};

        Departamento departamento = new Departamento();
        departamento.setEndereco(endereco4);
        departamento.setPessoas(pessoas);

        System.out.println("==========================Enderecos==========================");
        System.out.println("Endereco 1: ");
        System.out.println("Cidade: " + endereco1.getCidade() + "\nBairro: " + endereco1.getBairro() + "\nRua: " + endereco1.getRua());
        System.out.println("-----------------------------------------------");
        System.out.println("Endereco 2: ");
        System.out.println("Cidade: " + endereco3.getCidade() + "\nBairro: " + endereco3.getBairro() + "\nRua: " + endereco3.getRua());
        System.out.println("-----------------------------------------------");
        System.out.println("Endereco 3: ");
        System.out.println("Cidade: " + endereco2.getCidade() + "\nBairro: " + endereco2.getBairro() + "\nRua: " + endereco2.getRua());
        System.out.println("-----------------------------------------------");
        System.out.println("Endereco 4: ");
        System.out.println("Cidade: " + endereco4.getCidade() + "\nBairro: " + endereco4.getBairro() + "\nRua: " + endereco4.getRua());


        System.out.println("\n==========================Pessoas==========================");
        System.out.println("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade() + "\nGenero: " + pessoa1.getGenero() + "\nIdentidade: " + pessoa1.getIdentidade());
        System.out.println("Endereco: ");
        System.out.println("Cidade: " + endereco1.getCidade() + "\nBairro: " + endereco1.getBairro() + "\nRua: " + endereco1.getRua());
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + pessoa2.getNome() + "\nIdade: " + pessoa2.getIdade() + "\nGenero: " + pessoa2.getGenero() + "\nIdentidade: " + pessoa2.getIdentidade());
        System.out.println("Endereco: ");
        System.out.println("Cidade: " + endereco2.getCidade() + "\nBairro: " + endereco2.getBairro() + "\nRua: " + endereco2.getRua());
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + pessoa3.getNome() + "\nIdade: " + pessoa3.getIdade() + "\nGenero: " + pessoa3.getGenero() + "\nIdentidade: " + pessoa3.getIdentidade());
        System.out.println("Endereco: ");
        System.out.println("Cidade: " + endereco3.getCidade() + "\nBairro: " + endereco3.getBairro() + "\nRua: " + endereco3.getRua());

        departamento.imprimir();
        System.out.println(departamento.toString());
    }
}
