package mz.ac.up.Mauricio;


import java.util.Scanner;

public class MetodosStart {
    public static void main(String[] args) {
        Metodos func = new Metodos();

        //func.somaDois(15,16);
        //System.out.println("16 x 15 = "+func.multiplicaDois(16,15));
        int n1, n2;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o numero 1: ");
        n1 = leia.nextInt();
        System.out.print("Informe o numero 2: ");
        n2 = leia.nextInt();
        System.out.println(func.parImpar(n1, n2));
    }
}
