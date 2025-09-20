package mz.ac.up.javacore.sobrecargametodos.testes;

import mz.ac.up.javacore.sobrecargametodos.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa kelvia = new Pessoa();
        kelvia.init("Kelvia Maduela","Fomento","835435455");
        kelvia.imprimir();

        System.out.println("---------------------------------");

        Pessoa mauricio = new Pessoa();
        mauricio.init("Mauricio","Matola C","87465465","Mauricio@gmail.com");
        mauricio.imprimir();

        System.out.println("---------------------------------");

        Pessoa jose = new Pessoa("José Albino","Malhampsene","878678646","josemacondzo@gmail.com");
        jose.imprimir();
        System.out.println(jose.toString());
    }
}
