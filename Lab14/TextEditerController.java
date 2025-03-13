package Lab14;

import java.awt.event.*;
import java.io.*;
import javax.swing.JFileChooser;

public class TextEditerController implements ActionListener{
    
    private TextEditorGUI gui;
    private String message = "";

    public TextEditerController() {
        gui = new TextEditorGUI();
        gui.getCreate().addActionListener(this);
        gui.getOpen().addActionListener(this);
        gui.getClose().addActionListener(this);
        gui.getSave().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(gui.getCreate())) {
            gui.getArea().setText("");
        }
        else if (e.getSource().equals(gui.getOpen())) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(gui.getFr());
            File f = fc.getSelectedFile();
            try (FileInputStream fin = new FileInputStream(f); DataInputStream din = new DataInputStream(fin)){
                message = din.readUTF();
                gui.getArea().setText(message);
                
            } catch (IOException ev) {
                ev.printStackTrace();
            }

        }
        else if (e.getSource().equals(gui.getSave())) {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(gui.getFr());
            File f = fc.getSelectedFile();
            try (FileOutputStream fout = new FileOutputStream(f); DataOutputStream dout = new DataOutputStream(fout)){
                message = gui.getArea().getText();
                dout.writeUTF(message);
                
            } catch (IOException ev) {
                ev.printStackTrace();
            }
        }
        else if (e.getSource().equals(gui.getClose())) {
            System.exit(0);
        }
    }
    
    
    
}
