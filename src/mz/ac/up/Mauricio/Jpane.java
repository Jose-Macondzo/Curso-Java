package mz.ac.up.Mauricio;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class Jpane {
    public static void main(String[] args) {
        /**
         *showMessageDialog
         *showInputDialog
         *showOptionDialog
         *showConfirmDialog
         * ImageIcon
         */

        ImageIcon icone = new ImageIcon("imagens/checked.png");

        //JOptionPane.showMessageDialog(null, "Mensagem", "titulo", JOptionPane.QUESTION_MESSAGE, icone);


        int resp1 = JOptionPane.showConfirmDialog(null, "É mulato?", "Etnia", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(resp1);
        String[] opcoes = {"Croassant", "Bola de Berlin","Bolinho de Natas"};

        int resp = JOptionPane.showOptionDialog(null,
                "Que sobremesa prefere?",
                "Preferencia",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, opcoes,
                opcoes[0]);

        if(resp == 0){
            System.out.println("Escolheu Croassant");
        }else if(resp == 1){
            System.out.println("Escolheu Bola de Berlin");
        }else{
            System.out.println("Escolheu Bolinho de Natas");
        }


    }

}
