package Lab12;

import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class EventHandling_std implements ActionListener, WindowListener {

    private StudentView std;
    private Student s = new Student();

    public EventHandling_std(StudentView std) {
        this.std = std;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!isNumeric(this.std.getT1().getText())) {
            this.std.getT1().setForeground(Color.red);
            JOptionPane.showMessageDialog(this.std.getFr(), "Invalid ID! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.std.getT1().setForeground(Color.black);
            if (ae.getSource().equals(this.std.getB1())) {
                s.setMoney(s.getMoney() + 100);
                this.std.getT3().setText("" + s.getMoney());
            } else if (ae.getSource().equals(this.std.getB2())) {
                s.setMoney(s.getMoney() - 100);
                this.std.getT3().setText("" + s.getMoney());
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); ObjectOutputStream oout = new ObjectOutputStream(fout);) {
            s.setID(Integer.parseInt(this.std.getT1().getText()));
            s.setName(this.std.getT2().getText());
            oout.writeObject(s);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (NumberFormatException ex) {
            System.out.println("Your ID is invalid");
        } finally {
            System.exit(0);
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
        Student sv = null;
        File f = new File("StudentM.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f); ObjectInputStream Oin = new ObjectInputStream(fin);) {
                sv = (Student) Oin.readObject();
                s.setMoney(sv.getMoney());
                this.std.getT1().setText(sv.getID() + "");
                this.std.getT2().setText(sv.getName());
                this.std.getT3().setText(sv.getMoney() + "");
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
