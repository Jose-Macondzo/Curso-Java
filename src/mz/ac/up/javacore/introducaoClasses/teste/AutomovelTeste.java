package mz.ac.up.javacore.introducao.teste;

import mz.ac.up.javacore.introducao.classes.Automovel;

public class AutomovelTeste {
    public static void main(String[] args) {
        //Automovel[] automovel1 = new Automovel[2];
        Automovel automovel2 = new Automovel();
        Automovel automovel3 = new Automovel();

//        automovel1[0].marca = "Toyota";
//        automovel1[0].matricula = "AFS 123 MC";
//        automovel1[0].modelo = "Sedan";
//
//        automovel1[1].marca = "Mercedes";
//        automovel1[1].matricula = "AZD 321 TT";
//        automovel1[1].modelo = "SUV";
//
//        System.out.println(automovel1[0].marca);
//        System.out.println(automovel1[0].matricula);
//        System.out.println(automovel1[0].modelo);

        automovel2.setMarca("Toyota");
        automovel2.setMatricula("AFS 123 MC");
        automovel2.setModelo("Sedan");

        automovel3.setMarca("Mercedes");
        automovel3.setMatricula("HGD 321 TT");
        automovel3.setModelo("SUV");

        System.out.println("-----------------------------------");
//
        System.out.println(automovel2.toString());

        System.out.println("--------------------------------");

        System.out.println(automovel3.toString());

    }
}
