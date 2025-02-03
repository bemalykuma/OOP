package Lab9;

import java.awt.*;
import javax.swing.*;

public class CalculatorSample {

    private JFrame fr;
    private JButton bn_plus, bn_minus, bn_mul, bn_div, bn_equal, bn_clear, bn_1, bn_2, bn_3, bn_4, bn_5, bn_6, bn_7, bn_8, bn_9, bn_0;
    private JPanel button;
    private JTextField txt;
    private EventHandling_Cal eventHandling;
    
    public CalculatorSample() {
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
        
        eventHandling = new EventHandling_Cal(this);
        bn_0.addActionListener(eventHandling);
        bn_1.addActionListener(eventHandling);
        bn_2.addActionListener(eventHandling);
        bn_3.addActionListener(eventHandling);
        bn_4.addActionListener(eventHandling);
        bn_5.addActionListener(eventHandling);
        bn_6.addActionListener(eventHandling);
        bn_7.addActionListener(eventHandling);
        bn_8.addActionListener(eventHandling);
        bn_9.addActionListener(eventHandling);
        bn_plus.addActionListener(eventHandling);
        bn_minus.addActionListener(eventHandling);
        bn_mul.addActionListener(eventHandling);
        bn_div.addActionListener(eventHandling);
        bn_clear.addActionListener(eventHandling);
        bn_equal.addActionListener(eventHandling);
        
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

    public void setBn_0(JButton bn_0) {
        this.bn_0 = bn_0;
    }

    public void setBn_1(JButton bn_1) {
        this.bn_1 = bn_1;
    }

    public void setBn_2(JButton bn_2) {
        this.bn_2 = bn_2;
    }

    public void setBn_3(JButton bn_3) {
        this.bn_3 = bn_3;
    }

    public void setBn_4(JButton bn_4) {
        this.bn_4 = bn_4;
    }

    public void setBn_5(JButton bn_5) {
        this.bn_5 = bn_5;
    }

    public void setBn_6(JButton bn_6) {
        this.bn_6 = bn_6;
    }

    public void setBn_7(JButton bn_7) {
        this.bn_7 = bn_7;
    }

    public void setBn_8(JButton bn_8) {
        this.bn_8 = bn_8;
    }

    public void setBn_9(JButton bn_9) {
        this.bn_9 = bn_9;
    }

    public void setBn_clear(JButton bn_clear) {
        this.bn_clear = bn_clear;
    }

    public void setBn_div(JButton bn_div) {
        this.bn_div = bn_div;
    }

    public void setBn_equal(JButton bn_equal) {
        this.bn_equal = bn_equal;
    }

    public void setBn_minus(JButton bn_minus) {
        this.bn_minus = bn_minus;
    }

    public void setBn_mul(JButton bn_mul) {
        this.bn_mul = bn_mul;
    }

    public void setBn_plus(JButton bn_plus) {
        this.bn_plus = bn_plus;
    }

    public void setButton(JPanel button) {
        this.button = button;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public void setEventHandling(EventHandling_Cal eventHandling) {
        this.eventHandling = eventHandling;
    }

    public JButton getBn_0() {
        return bn_0;
    }

    public JButton getBn_1() {
        return bn_1;
    }

    public JButton getBn_2() {
        return bn_2;
    }

    public JButton getBn_3() {
        return bn_3;
    }

    public JButton getBn_4() {
        return bn_4;
    }

    public JButton getBn_5() {
        return bn_5;
    }

    public JButton getBn_6() {
        return bn_6;
    }

    public JButton getBn_7() {
        return bn_7;
    }

    public JButton getBn_8() {
        return bn_8;
    }

    public JButton getBn_9() {
        return bn_9;
    }

    public JButton getBn_clear() {
        return bn_clear;
    }

    public JButton getBn_div() {
        return bn_div;
    }

    public JButton getBn_equal() {
        return bn_equal;
    }

    public JButton getBn_minus() {
        return bn_minus;
    }

    public JButton getBn_mul() {
        return bn_mul;
    }

    public JButton getBn_plus() {
        return bn_plus;
    }

    public JPanel getButton() {
        return button;
    }

    public EventHandling_Cal getEventHandling() {
        return eventHandling;
    }

    public JFrame getFr() {
        return fr;
    }

    public JTextField getTxt() {
        return txt;
    }
    
    
    
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
