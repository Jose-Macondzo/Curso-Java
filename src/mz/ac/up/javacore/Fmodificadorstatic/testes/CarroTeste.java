package mz.ac.up.javacore.Fmodificadorstatic.testes;

import mz.ac.up.javacore.Fmodificadorstatic.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca",90.5);
        Carro carro2 = new Carro("Escova",120);
        Carro carro3 = new Carro("Christal Light",100);

        Carro.velocidadeLimite = 95;
        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();


    }
}
