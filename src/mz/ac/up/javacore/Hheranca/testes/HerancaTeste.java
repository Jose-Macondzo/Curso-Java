package mz.ac.up.javacore.Hheranca.testes;

import mz.ac.up.javacore.GAssociacaoclasses.classes.Endereco;
import mz.ac.up.javacore.GAssociacaoclasses.classes.Pessoa;
import mz.ac.up.javacore.Hheranca.classes.Funcionario;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Luis Ranito");
        pessoa1.setIdade(28);
        pessoa1.setGenero('M');
        pessoa1.setIdentidade("11041456456H");
        Endereco enderecoPessoa1 = new Endereco("Rua das avenidas","Silvestre Stallone","Maputo");
        pessoa1.setEnderecos(new Endereco[]{enderecoPessoa1});

        pessoa1.imprimir();

        Funcionario funcionario1 = new Funcionario();
        Endereco enderecoFuncionario1 = new Endereco("Rua sao paulo","Rio de Janeiro","Maputo");
        Endereco endereco2Funcionario1 = new Endereco("Rua Gonsalves","Sao Caetano","Matola");

        funcionario1.setNome("Mauricio Chongola");
        funcionario1.setIdade(27);
        funcionario1.setGenero('M');
        funcionario1.setIdentidade("11045416455L");
        funcionario1.setSalario(15000);
        funcionario1.setCargo("Analista de sistemas");
        funcionario1.setEnderecos(new Endereco[]{enderecoFuncionario1,endereco2Funcionario1});

        System.out.println("----------------------------------------");

        funcionario1.imprimir();
    }
}
