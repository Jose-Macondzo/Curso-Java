package mz.ac.up.javacore.GAssociacaoclasses.testes;

import mz.ac.up.javacore.GAssociacaoclasses.classes.Departamento;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Endereco;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Pessoa;

public class DepartamentoTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Uniao Africana","Matola A", "Matola");
        Pessoa pessoa1 = new Pessoa("Mauricio",27,'M',"10011016548K",new Endereco[]{endereco1});

        Endereco endereco2 = new Endereco("Maria das dores","Fomento","Matola");
        Pessoa pessoa2 = new Pessoa("Luis",28,'M',"15163185465L",new Endereco[]{endereco2});

        Endereco endereco3 = new Endereco("Industrias","Sikwama","Matola");
        Pessoa pessoa3 = new Pessoa("Macondzo",30,'M',"11001165474M",new Endereco[]{endereco3});

        Endereco endereco4 = new Endereco("Mocambique","Luis Cabral","Matola");
        Departamento departamento = new Departamento(new Pessoa[]{pessoa1,pessoa2,pessoa3},endereco4);

        System.out.println("---------As pessoas---------");
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());

        System.out.println("\n---------Os Enderecos---------");
        System.out.println(endereco1.toString());
        System.out.println(endereco2.toString());
        System.out.println(endereco3.toString());
        System.out.println(endereco4.toString());

        System.out.println("\n---------Os Departamentos---------");
        System.out.println(departamento.toString());
    }
}
