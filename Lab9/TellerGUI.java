package Lab9;

import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel button, top_1, top_2;
    private JButton b_1, b_2, b_3;
    private JTextField txt_input, txt_fix;
    private JLabel label1, label2;
    private EventHandling_Tel eventHandling;
    private Account balance;

    public TellerGUI(JFrame fr, JPanel button, JPanel top_1, JPanel top_2, JButton b_1, JButton b_2, JButton b_3, JTextField txt_input, JTextField txt_fix, JLabel label1, JLabel label2) {
        this.fr = fr;
        this.button = button;
        this.top_1 = top_1;
        this.top_2 = top_2;
        this.b_1 = b_1;
        this.b_2 = b_2;
        this.b_3 = b_3;
        this.txt_input = txt_input;
        this.txt_fix = txt_fix;
        this.label1 = label1;
        this.label2 = label2;
    }

    public TellerGUI() {
        balance = new Account();
        fr = new JFrame("Teller GUI");
        button = new JPanel();
        top_1 = new JPanel();
        top_2 = new JPanel();
        b_1 = new JButton("Deposit");
        b_2 = new JButton("Withdraw");
        b_3 = new JButton("Exit");
        txt_fix = new JTextField(this.balance.balance+"");
        txt_input = new JTextField();
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        
        eventHandling = new EventHandling_Tel(this);
        b_1.addActionListener(eventHandling);
        b_2.addActionListener(eventHandling);
        b_3.addActionListener(eventHandling);
        
        txt_fix.setEditable(false);
        
        fr.setLayout(new GridLayout(4,1));
        top_1.setLayout(new GridLayout(1,2));
        top_2.setLayout(new GridLayout(1,2));
        button.setLayout(new FlowLayout());
        
        top_1.add(label1);
        top_1.add(txt_fix);
        top_2.add(label2);
        top_2.add(txt_input);
        button.add(b_1);
        button.add(b_2);
        button.add(b_3);
        
        fr.add(top_1);
        fr.add(top_2);
        fr.add(button);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }

    public void setB_1(JButton b_1) {
        this.b_1 = b_1;
    }

    public void setB_2(JButton b_2) {
        this.b_2 = b_2;
    }

    public void setB_3(JButton b_3) {
        this.b_3 = b_3;
    }

    public void setEventHandling(EventHandling_Tel eventHandling) {
        this.eventHandling = eventHandling;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setTop_1(JPanel top_1) {
        this.top_1 = top_1;
    }

    public void setTop_2(JPanel top_2) {
        this.top_2 = top_2;
    }

    public void setButton(JPanel button) {
        this.button = button;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public void setTxt_fix(JTextField txt_fix) {
        this.txt_fix = txt_fix;
    }

    public void setTxt_input(JTextField txt_input) {
        this.txt_input = txt_input;
    }

    public JButton getB_1() {
        return b_1;
    }

    public JButton getB_2() {
        return b_2;
    }

    public JButton getB_3() {
        return b_3;
    }

    public JPanel getButton() {
        return button;
    }

    public EventHandling_Tel getEventHandling() {
        return eventHandling;
    }

    public JFrame getFr() {
        return fr;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JPanel getTop_1() {
        return top_1;
    }

    public JPanel getTop_2() {
        return top_2;
    }

    public JTextField getTxt_fix() {
        return txt_fix;
    }

    public JTextField getTxt_input() {
        return txt_input;
    }

    public void setBalance(Account balance) {
        this.balance = balance;
    }

    public Account getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}
