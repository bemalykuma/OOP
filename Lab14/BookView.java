package Lab14;

import java.awt.GridLayout;
import javax.swing.*;

public class BookView {

    private JFrame fr;
    private JPanel pName, pPrice, pType, pNum, pButton;
    private JLabel name, price, type;
    private JTextField txtName, txtPrice, txtNum;
    private JComboBox typeList;
    private JButton add, update, delete, left, right;

    public BookView() {

        fr = new JFrame();
        pButton = new JPanel();
        pPrice = new JPanel();
        pType = new JPanel();
        pName = new JPanel();
        pNum = new JPanel();

        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        txtName = new JTextField();
        txtPrice = new JTextField();
        txtNum = new JTextField("0");

        String[] typeSTR = { "General", "Computer", "Math&Sci", "Photo" };
        typeList = new JComboBox(typeSTR);

        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        left = new JButton("<<<");
        right = new JButton(">>>");

        pName.setLayout(new GridLayout(1, 2));
        pPrice.setLayout(new GridLayout(1, 2));
        pType.setLayout(new GridLayout(1, 2));

        fr.setLayout(new GridLayout(5, 1));
        fr.add(pName);
        fr.add(pPrice);
        fr.add(pType);
        fr.add(pNum);
        fr.add(pButton);
        pName.add(name);
        pName.add(txtName);
        pPrice.add(price);
        pPrice.add(txtPrice);
        pType.add(type);
        pType.add(typeList);
        pButton.add(add);
        pButton.add(update);
        pButton.add(delete);
        pNum.add(left);
        pNum.add(txtNum);
        pNum.add(right);
        txtNum.setEditable(false);

        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
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

    public JPanel getpNum() {
        return pNum;
    }

    public void setpNum(JPanel pNum) {
        this.pNum = pNum;
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

    public JTextField getTxtNum() {
        return txtNum;
    }

    public void setTxtNum(JTextField txtNum) {
        this.txtNum = txtNum;
    }

    public JComboBox getTypeList() {
        return typeList;
    }

    public void setTypeList(JComboBox typeList) {
        this.typeList = typeList;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public JButton getLeft() {
        return left;
    }

    public void setLeft(JButton left) {
        this.left = left;
    }

    public JButton getRight() {
        return right;
    }

    public void setRight(JButton right) {
        this.right = right;
    }

    
}
