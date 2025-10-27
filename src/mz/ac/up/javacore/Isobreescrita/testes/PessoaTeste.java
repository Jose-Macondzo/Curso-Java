package mz.ac.up.javacore.Isobreescrita.testes;

import mz.ac.up.javacore.Isobreescrita.classes.Yuran;

public class PessoaTeste {
    public static void main(String[] args) {
        Yuran omar = new Yuran();

        omar.setNome("Yuran Ibraimo");
        omar.setIdade(17);
        omar.setCabelo(true);

        omar.imprimir();

        System.out.println("--------------");

        omar.setCabelo(false);
        omar.imprimir();

        System.out.println(omar.toString());
    }


}
