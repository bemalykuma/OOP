package Lab8;

import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {

    private JFrame fr;
    private JButton bn_plus, bn_minus, bn_mul, bn_div, bn_equal, bn_clear, bn_1, bn_2, bn_3, bn_4, bn_5, bn_6, bn_7, bn_8, bn_9, bn_0;
    private JPanel button;
    private JTextField txt;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        button = new JPanel();
        bn_plus = new JButton("+");
        bn_minus = new JButton("-");
        bn_mul = new JButton("x");
        bn_div = new JButton("/");
        bn_equal = new JButton("=");
        bn_clear = new JButton("c");
        bn_0 = new JButton("0");
        bn_1 = new JButton("1");
        bn_2 = new JButton("2");
        bn_3 = new JButton("3");
        bn_4 = new JButton("4");
        bn_5 = new JButton("5");
        bn_6 = new JButton("6");
        bn_7 = new JButton("7");
        bn_8 = new JButton("8");
        bn_9 = new JButton("9");
        
        txt = new JTextField();
        
        fr.setLayout(new BorderLayout());
        button.setLayout(new GridLayout(4, 4));
        
        button.add(bn_7);
        button.add(bn_8);
        button.add(bn_9);
        button.add(bn_plus);
        button.add(bn_4);
        button.add(bn_5);
        button.add(bn_6);
        button.add(bn_minus);
        button.add(bn_1);
        button.add(bn_2);
        button.add(bn_3);
        button.add(bn_mul);
        button.add(bn_0);
        button.add(bn_clear);
        button.add(bn_equal);
        button.add(bn_div);
        
        fr.add(txt, BorderLayout.NORTH);
        fr.add(button);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
