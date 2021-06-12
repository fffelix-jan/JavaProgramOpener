package org.felixan.javaprogramopener;

import javax.swing.*;
import java.awt.FileDialog;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        FileDialog fd = new FileDialog(frame, "Run Program", FileDialog.LOAD);
        fd.setVisible(true);

        String fileDir = fd.getDirectory();
        String fileName = fd.getFile();

        if (fileName == null) {
            JOptionPane.showMessageDialog(frame, "No file was selected. You must select a file to run.", "No File Selected", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        else {
            Runtime.getRuntime().exec(fileDir + fileName);
            System.exit(0);
        }
    }
}
