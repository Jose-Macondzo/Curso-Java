package mz.ac.up.Consolidacao01.ControleFluxo;

public class ControleFluxo2 {
    public static void main(String[] args) {
        //? - Operador ternario
        int idade = 18;
        String status;

        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";

        System.out.println(status);
    }
}
