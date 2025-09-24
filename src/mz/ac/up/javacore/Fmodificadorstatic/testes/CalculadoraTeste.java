package mz.ac.up.javacore.Fmodificadorstatic.testes;

import mz.ac.up.javacore.Fmodificadorstatic.classes.Calculadora;

import java.lang.Math;

public class CalculadoraTeste {

    public static void main(String[] args) {
        int numero1 = 16;
        int numero2 = 6;
        System.out.println("A soma " + numero1 + " + " + numero2 + " = " + Calculadora.soma(numero1, numero2));
        System.out.println("A diferenca " + numero1 + " - " + numero2 + " = " + Calculadora.subtrai(numero1, numero2));
        System.out.println("O produto " + numero1 + " * " + numero2 + " = " + Calculadora.multiplica(numero1, numero2));
        System.out.println("A razao " + numero1 + " / " + numero2 + " = " +  Calculadora.divide(numero1, numero2));

        System.out.println("A raiz quadrada de " + numero1 + " = " + Math.sqrt(numero1));
    }
}
