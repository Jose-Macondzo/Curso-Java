package mz.ac.up.Consolidacao01.Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //conjucao "e" - "&&". disjuncao "ou" - "||"

        System.out.println(5 > 5 || 5 == 5);
        if (5 > 5) {
            System.out.println("true 5 > 5");
        } else if (5 == 5) {
            System.out.println("true 5 = 5");
        }else{
            System.out.println("false");
        }
        System.out.println(5 > 4 && 4 < 5);

        int idade = 18;
        boolean membro = true;
        int idadeMinima = 18;

        if(membro && idade >= 18){
            System.out.println("É membro do clube");
        }else System.out.println("Nao é membro do clube");
    }
}
