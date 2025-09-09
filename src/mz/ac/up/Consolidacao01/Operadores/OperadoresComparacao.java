package mz.ac.up.Consolidacao01.Operadores;

public class OperadoresComparacao {
    public static void main(String[] args) {

        int idade = 17;
        int idadeMinima = 18; //entrar num clube

        if (idade > 17) {
            System.out.println("Pode entar no clube");
        } else
            System.out.println("Nao pode entar no clube");

        if (idade < idadeMinima) {
            System.out.println("Nao pode entar no clube");
        } else {
            System.out.println("Pode entar no clube");
        }

        if (idade >= idadeMinima) {
            System.out.println("Pode entar no clube");
        } else
            System.out.println("Nao pode entar no clube");

        if (idadeMinima <= idade) {
            if (idade == idadeMinima) {
                System.out.println("Pode entrar no clube");
            } else if (idade < idadeMinima) {
                System.out.println("Nao pode entrar no clube");
            }
        }


        if (idade == idadeMinima) {
            System.out.println("pode entrar no clube");
        } else if (idade < idadeMinima) {
            System.out.println("Nao pode entrar no clube");
        } else
            System.out.println("Pode entrar no clube");

        if (idade != idadeMinima) {
            if (idade > idadeMinima) {
                System.out.println("Pode entrar no clube");
            } else
                System.out.println("Nao pode entrar no clube");
        }


        System.out.println(5 >= 5);
    }
}
