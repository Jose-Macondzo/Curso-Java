package mz.ac.up.javacore.introducaoClasses.teste;

import mz.ac.up.javacore.introducaoClasses.classes.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner leia = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Informe o primeiro numero: ");
        numero1 = leia.nextInt();

        System.out.print("Informe o segundo numero: ");
        numero2 = leia.nextInt();

        System.out.println("------------------------");
        calc.somaDois(numero1,numero2);
        System.out.println("------------------------");
        calc.subtraiDois(numero1,numero2);
        System.out.println("------------------------");
        calc.multiplicaDois(numero1,numero2);
        System.out.println("------------------------");
        calc.divideDois(numero1,numero2);


    }
}
