package Lab12;

import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventHandling_Chat implements ActionListener, WindowListener, KeyListener {

    private ChatDemo chat;
    private String Message = "";

    public EventHandling_Chat(ChatDemo chat) {
        this.chat = chat;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(chat.getSub())) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Message += dtf.format(LocalDateTime.now()) + ":" + this.chat.getTxtField().getText() + '\n';
            this.chat.getTxtArea().setText(Message);
            this.chat.getTxtField().setText("");

        }
        if (ae.getSource().equals(chat.getRe())) {
            this.chat.getTxtArea().setText("");
            this.chat.getTxtField().setText("");
            Message = "";
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat"); DataOutputStream dout = new DataOutputStream(fout);) {
            dout.writeUTF(Message);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        System.exit(0);
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
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f); DataInputStream din = new DataInputStream(fin);) {
                String MassageString = din.readUTF();
                Message += MassageString;
                this.chat.getTxtArea().setText(Message);

            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && !this.chat.getTxtField().getText().isEmpty()) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            Message += dtf.format(LocalDateTime.now()) + ":" + this.chat.getTxtField().getText() + '\n';
            this.chat.getTxtArea().setText(Message);
            this.chat.getTxtField().setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
    

}
