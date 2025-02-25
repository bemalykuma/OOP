package Lab12;

import java.awt.*;
import javax.swing.*;

public class ChatDemo {
    private JFrame fr;
    private JButton sub, re;
    private JTextArea txtArea;
    private JTextField txtField;
    private JPanel p1, p2;
    private EventHandling_Chat e;

    public ChatDemo() {
        fr = new JFrame();
        txtArea = new JTextArea();
        txtField = new JTextField();
        sub = new JButton("Submit");
        re = new JButton("Reset");
        p1 = new JPanel();
        p2 = new JPanel();
        e = new EventHandling_Chat(this);
        
        fr.setLayout(new BorderLayout());
        txtArea.setSize(45, 20);
        txtArea.setEditable(false);
        p1.setLayout(new GridLayout(2,1));
        p2.setLayout(new FlowLayout());
        p2.add(sub);
        p2.add(re);
        p1.add(txtField);
        p1.add(p2);
        fr.add(txtArea, BorderLayout.CENTER);
        fr.add(p1, BorderLayout.SOUTH);
        
        sub.addActionListener(e);
        re.addActionListener(e);
        fr.addWindowListener(e);
        txtField.addKeyListener(e);
        
        fr.setVisible(true);
        fr.setSize(421, 340);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setE(EventHandling_Chat e) {
        this.e = e;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public void setRe(JButton re) {
        this.re = re;
    }

    public void setSub(JButton sub) {
        this.sub = sub;
    }

    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }

    public void setTxtField(JTextField txtField) {
        this.txtField = txtField;
    }

    public EventHandling_Chat getE() {
        return e;
    }

    public JFrame getFr() {
        return fr;
    }

    public JPanel getP1() {
        return p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public JButton getRe() {
        return re;
    }

    public JButton getSub() {
        return sub;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public JTextField getTxtField() {
        return txtField;
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }
}
