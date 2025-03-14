package Exercise;

import java.awt.BorderLayout;
import javax.swing.*;

public class ClientBChat{

    private JFrame fr;
    private JTextArea area;
    private JButton btnB;
    private JTextField field;
    private JPanel p;

    public ClientBChat() {
        fr = new JFrame("Chatbox (Fake Websocket)-Client B");
        area = new JTextArea();
        btnB = new JButton("Send");
        field = new JTextField();
        p = new JPanel();

        area.setEditable(false);
        fr.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(field, BorderLayout.CENTER);
        p.add(btnB, BorderLayout.EAST);
        fr.add(area, BorderLayout.CENTER);
        fr.add(p, BorderLayout.SOUTH);

        fr.setLocation(500, 0);
        fr.setSize(500,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public JTextArea getArea() {
        return area;
    }

    public JButton getBtn() {
        return btnB;
    }

    public JTextField getField() {
        return field;
    }

    public JPanel getP() {
        return p;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

    public void setBtn(JButton btnB) {
        this.btnB = btnB;
    }

    public void setField(JTextField field) {
        this.field = field;
    }

    public void setP(JPanel p) {
        this.p = p;
    }


}
