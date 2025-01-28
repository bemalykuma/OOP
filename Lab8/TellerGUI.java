package Lab8;

import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel button, top_1, top_2;
    private JButton b_1, b_2, b_3;
    private JTextField txt_input, txt_fix;
    private JLabel label1, label2;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        button = new JPanel();
        top_1 = new JPanel();
        top_2 = new JPanel();
        b_1 = new JButton("Deposit");
        b_2 = new JButton("Withdraw");
        b_3 = new JButton("Exit");
        txt_fix = new JTextField("6000");
        txt_input = new JTextField();
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        
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
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}
