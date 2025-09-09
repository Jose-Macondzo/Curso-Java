package mz.ac.up.Consolidacao01.ControleFluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        // se for < 15 anos: Infantil
        //>=15 && < 18 : junvenil
        //>=18: Adulto
        //if-else
        int idade = 18;
        String categoria;
        //valores booleanos: false e true

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println("A categoria é: "+categoria);
    }

}
