package Exercise;

import java.awt.BorderLayout;
import javax.swing.*;


public class ClientAChat{
    private JFrame fr;
    private JTextArea area;
    private JButton btnA;
    private JTextField field;
    private JPanel p;


    public ClientAChat() {
        fr = new JFrame("Chatbox (Fake Websocket)-Client A");
        area = new JTextArea();
        btnA = new JButton("Send");
        field = new JTextField();
        p = new JPanel();

        area.setEditable(false);
        fr.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        p.add(field, BorderLayout.CENTER);
        p.add(btnA, BorderLayout.EAST);
        fr.add(area, BorderLayout.CENTER);
        fr.add(p, BorderLayout.SOUTH);
        
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
        return btnA;
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

    public void setBtn(JButton btnA) {
        this.btnA = btnA;
    }

    public void setField(JTextField field) {
        this.field = field;
    }

    public void setP(JPanel p) {
        this.p = p;
    }
    
    
    
}
