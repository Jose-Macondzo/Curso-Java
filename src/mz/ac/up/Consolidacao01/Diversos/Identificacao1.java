package mz.ac.up.Consolidacao01.Diversos;

import javax.swing.*;

public class Identificacao1 {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
        String apelido = JOptionPane.showInputDialog(null, "Qual o seu apelido");
        String telefone = JOptionPane.showInputDialog(null, "Qual o seu telefone?");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o seu ano de nascimento?"));
        int idade = 2025 - anoNascimento;

        JOptionPane.showMessageDialog(null, "Nome: "+nome+" "+apelido+"\nTelefone: "+telefone+"\nIdade: "+idade);




    }
}
