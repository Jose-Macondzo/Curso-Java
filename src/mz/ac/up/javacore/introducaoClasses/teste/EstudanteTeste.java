package mz.ac.up.javacore.introducao.teste;

import mz.ac.up.javacore.introducao.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante mauricio = new Estudante();

        mauricio.nome = "Mauricio Chongola";
        mauricio.idade = 17;
        mauricio.matricula = "1717";

        System.out.println("Nome: " + mauricio.nome);
        System.out.println("Idade: " + mauricio.idade);
        System.out.println("Matricula: " + mauricio.matricula);

        Estudante luis = new Estudante();

        System.out.println("-----------------------------");

        luis.nome = "Luis Ranito";
        luis.idade = 18;
        luis.matricula = "1818";

        System.out.println("Nome: " + luis.nome);
        System.out.println("Idade: " + luis.idade);
        System.out.println("Matricula: " + luis.matricula);
    }
}
