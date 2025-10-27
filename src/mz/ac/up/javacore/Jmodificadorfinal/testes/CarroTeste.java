package mz.ac.up.javacore.Jmodificadorfinal.testes;

import mz.ac.up.javacore.Jmodificadorfinal.classes.Carro;
import mz.ac.up.javacore.Jmodificadorfinal.classes.Subaru;

public class CarroTeste {
    public static void main(String[] args) {
        Subaru subaru = new Subaru();
        subaru.setMarca("Subaru");
        subaru.setNome("Legacy");
        subaru.setModelo("B4 spec-GT-turbo");

        System.out.println(subaru);


    }
}
