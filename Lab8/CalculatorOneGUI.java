package Lab8;

import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JButton bn_plus, bn_minus, bn_mul, bn_div;
    private JPanel p;
    private JTextField txt;
    
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        bn_plus = new JButton("plus");
        bn_minus = new JButton("minus");
        bn_mul = new JButton("multiply");
        bn_div = new JButton("divide");
        txt = new JTextField();
        
        fr.setLayout(new GridLayout(4,1));
        p.setLayout(new FlowLayout());
        p.add(bn_plus);
        p.add(bn_minus);
        p.add(bn_mul);
        p.add(bn_div);
        
        fr.add(txt);
        fr.add(new JPanel());
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
       new CalculatorOneGUI();
    }
}
