package Lab14;

import java.awt.*;
import javax.swing.*;

public class BookAdd {

    private JFrame fr;
    private JPanel pName, pPrice, pType, pButton;
    private JLabel name, price, type;
    private JTextField txtName, txtPrice;
    private JComboBox typeList;
    private JButton insert;

    public BookAdd() {

        fr = new JFrame();
        pButton = new JPanel();
        pPrice = new JPanel();
        pType = new JPanel();
        pName = new JPanel();
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        txtName = new JTextField();
        txtPrice = new JTextField();

        typeList = new JComboBox();
        typeList.addItem("General");
        typeList.addItem("Computer");
        typeList.addItem("Math&Sci");
        typeList.addItem("Photo");

        insert = new JButton("Insert");

        pName.setLayout(new GridLayout(1, 2));
        pPrice.setLayout(new GridLayout(1, 2));
        pType.setLayout(new GridLayout(1, 2));

        fr.setLayout(new GridLayout(4, 1));
        fr.add(pName);
        fr.add(pPrice);
        fr.add(pType);
        fr.add(pButton);
        pName.add(name);
        pName.add(txtName);
        pPrice.add(price);
        pPrice.add(txtPrice);
        pType.add(type);
        pType.add(typeList);
        pButton.add(insert);
        
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250,140);
        fr.setVisible(true);

    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getpName() {
        return pName;
    }

    public void setpName(JPanel pName) {
        this.pName = pName;
    }

    public JPanel getpPrice() {
        return pPrice;
    }

    public void setpPrice(JPanel pPrice) {
        this.pPrice = pPrice;
    }

    public JPanel getpType() {
        return pType;
    }

    public void setpType(JPanel pType) {
        this.pType = pType;
    }

    public JPanel getpButton() {
        return pButton;
    }

    public void setpButton(JPanel pButton) {
        this.pButton = pButton;
    }

    public JLabel getName() {
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public JLabel getPrice() {
        return price;
    }

    public void setPrice(JLabel price) {
        this.price = price;
    }

    public JLabel getType() {
        return type;
    }

    public void setType(JLabel type) {
        this.type = type;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public JTextField getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(JTextField txtPrice) {
        this.txtPrice = txtPrice;
    }

    public JComboBox getTypeList() {
        return typeList;
    }

    public void setTypeList(JComboBox typeList) {
        this.typeList = typeList;
    }

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }
    

}
