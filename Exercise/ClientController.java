package Exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientController implements ActionListener, WindowListener {

    private ClientAChat a;
    private ClientBChat b;
    private String messageA = "";
    private String messageB = "";
    private Message message;

    public ClientController() {
        a = new ClientAChat();
        b = new ClientBChat();
        message = new Message();

        a.getBtn().addActionListener(this);
        b.getBtn().addActionListener(this);
        a.getFr().addWindowListener(this);
        b.getFr().addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        if (ev.getSource().equals(a.getBtn())) {
            if (a.getField() != null) {
                messageA += "[" + dtf.format(LocalDateTime.now()) + "]" + " A(You): " + a.getField().getText() + '\n';
                messageB += "[" + dtf.format(LocalDateTime.now()) + "]" + " A: " + a.getField().getText() + '\n';
                a.getArea().setText(messageA);
                b.getArea().setText(messageB);
                a.getField().setText("");
            }
        } else if (ev.getSource().equals(b.getBtn())) {
            if (b.getField() != null) {
                messageB += "[" + dtf.format(LocalDateTime.now()) + "]" + " B(You): " + b.getField().getText() + '\n';
                messageA += "[" + dtf.format(LocalDateTime.now()) + "]" + " B: " + b.getField().getText() + '\n';
                a.getArea().setText(messageA);
                b.getArea().setText(messageB);
                b.getField().setText("");

            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        Message newM = null;
        File f = new File("chat_history.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f); ObjectInputStream Oin = new ObjectInputStream(fin);) {
                newM = (Message)Oin.readObject();
                messageA = newM.getMessageA();
                messageB = newM.getMessageB();
                this.a.getArea().setText(newM.getMessageA());
                this.b.getArea().setText(newM.getMessageB());
                
            } catch (IOException|ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("chat_history.dat"); ObjectOutputStream Oout = new ObjectOutputStream(fout);) {
            message.setMessageA(messageA);
            message.setMessageB(messageB);
            Oout.writeObject(message);
            a.getArea().setText("");
            b.getArea().setText("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
