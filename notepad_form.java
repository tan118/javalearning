

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class notepad_form {

    public static void main(String[] args) {

        JFrame f1 = new JFrame("Notepad");
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem saveAs = new JMenuItem("Save As");

        file.add(newFile);
        file.add(saveAs);

        JMenu edit = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        mb.add(file);
        mb.add(edit);

        f1.setJMenuBar(mb);
        f1.add(sp);

        newFile.addActionListener(e -> ta.setText(""));
        cut.addActionListener(e -> ta.cut());
        copy.addActionListener(e -> ta.copy());
        paste.addActionListener(e -> ta.paste());

        saveAs.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            int option = fc.showSaveDialog(f1);

            if (option == JFileChooser.APPROVE_OPTION) {
                File file1 = fc.getSelectedFile();
                try (FileWriter fw = new FileWriter(file1)) {
                    fw.write(ta.getText());
                    JOptionPane.showMessageDialog(f1, "File Saved Successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(f1, "Error Saving File");
                }
            }
        });

        f1.setVisible(true);
    }
}


