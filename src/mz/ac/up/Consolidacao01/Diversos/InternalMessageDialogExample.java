package mz.ac.up.Consolidacao01.Diversos;

import javax.swing.*;

public class InternalMessageDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.add(desktopPane);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);


        // Display an internal message dialog within the internalFrame
        JOptionPane.showInternalMessageDialog(internalFrame,
                "This is an internal message!",
                "Internal Dialog",
                JOptionPane.INFORMATION_MESSAGE);

        frame.setVisible(true);
    }
}