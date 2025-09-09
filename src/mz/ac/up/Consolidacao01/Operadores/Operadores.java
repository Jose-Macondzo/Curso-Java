package mz.ac.up.Consolidacao01.Operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 2134;
        numero2 = 16345;

        //operadores aritimetricos
        int soma = numero1 + numero2;
        System.out.println(soma);
        System.out.println(numero1 + numero2);
        System.out.println(numero2 - numero1);
        System.out.println(numero1 * numero2);
        System.out.println(numero2 / numero1);

        float num1 = 99;
        float num2 = 29;

        System.out.println(num1 / num2);
        System.out.println((double) num1 / num2);

        //Combo atribuicao e operacao

        soma += numero1;
        soma *= numero2;

        //Operador de resto

        int numerador = 51;
        int divisor = 2;

        if (numerador % divisor == 0) {
            System.out.println("Sim "+numerador+" é um numero par");
        }else{
            System.out.println("Nao "+numerador+" é um numero impar");
        }

        soma %= divisor;
    }
}
