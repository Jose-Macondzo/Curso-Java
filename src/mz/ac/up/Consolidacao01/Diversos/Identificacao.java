package mz.ac.up.Consolidacao01.Diversos;

import javax.swing.*;

public class Identificacao {
    public static void main(String[] args){
        String nome;
        String morada;
        String telefone;

        nome = JOptionPane.showInputDialog(null, "Introduza o seu nome completo");
        morada = JOptionPane.showInputDialog(null, "Introduza o seu Endereco");
        telefone = JOptionPane.showInputDialog(null, "Introduza o seu Telefone");

        JOptionPane.showMessageDialog(null,"Nome completo: "+nome+
                "\nMorada: "+morada+"\nTelefone: "+telefone);
    }
}
