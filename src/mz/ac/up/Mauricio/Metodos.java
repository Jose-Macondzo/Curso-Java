package mz.ac.up.Mauricio;

import javax.swing.*;

public class Metodos {

    public void somaDois(int numero1, int numero2) {
        int soma = numero1 + numero2;
        String resposta = "A soma: " + numero1 + " + " + numero2 + " = " + soma;
        JOptionPane.showMessageDialog(null, resposta);
    }

    public int multiplicaDois(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public String parImpar(int numero) {

        String resposta = "";
        if (numero % 2 == 0) {
            resposta += numero + " é par.";
        } else {
            resposta += numero + " é impar.";
        }
        return resposta;
    }

    public String parImpar(int numero, int numero2) {
        String resposta = "";
        if (numero % 2 == 0 && numero2 % 2 == 0) {
            resposta += numero + " e " + numero2 + " sao pares.";
        } else if (!(numero % 2 == 0) && !(numero2 % 2 == 0)) {
            resposta += numero + " e " + numero2 + " sao impares.";
        } else if (numero % 2 == 0 && !(numero2 % 2 == 0)) {
            resposta += numero + " é par e " + numero2 + " é impar.";
        } else {
            resposta += numero + " é impar e " + numero2 + " é par.";
        }
        return resposta;
    }
}
