package Lab12;

import java.awt.*;
import javax.swing.*;

public class StudentView {
    private JFrame fr;
    private JPanel p1, p2;
    private JButton b1, b2;
    private JLabel l1, l2, l3;
    private JTextField t1, t2, t3;
    private EventHandling_std e;

    public StudentView() {
        fr = new JFrame(" StudentProfile");
        p1 = new JPanel(new GridLayout(3,2));
        p2 = new JPanel(new FlowLayout());
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        l1 = new JLabel("ID :");
        l2 = new JLabel("Name :");
        l3 = new JLabel("Money :");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField("0");
        e = new EventHandling_std(this);
        
        t3.setEditable(false);
        b1.addActionListener(e);
        b2.addActionListener(e);
        fr.addWindowListener(e);
        fr.setLayout(new BorderLayout());
        p2.add(b1);
        p2.add(b2);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public JButton getB1() {
        return b1;
    }

    public JButton getB2() {
        return b2;
    }

    public JFrame getFr() {
        return fr;
    }

    public JLabel getL1() {
        return l1;
    }

    public JLabel getL2() {
        return l2;
    }

    public JLabel getL3() {
        return l3;
    }

    public JPanel getP1() {
        return p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public JTextField getT1() {
        return t1;
    }

    public JTextField getT2() {
        return t2;
    }

    public JTextField getT3() {
        return t3;
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

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public void setB2(JButton b2) {
        this.b2 = b2;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public void setL3(JLabel l3) {
        this.l3 = l3;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    public void setT2(JTextField t2) {
        this.t2 = t2;
    }

    public void setT3(JTextField t3) {
        this.t3 = t3;
    }
    
    public static void main(String[] args) {
        new StudentView();
    }
}
