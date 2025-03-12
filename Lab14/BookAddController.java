package Lab14;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class BookAddController implements ActionListener {

    private BookAdd add;
    private Book book;
    private BookArray array;

    public BookAddController(BookArray array) {
        this.array = array;
        add = new BookAdd();
        add.getInsert().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String price = add.getTxtPrice().getText();
        String name = add.getTxtName().getText();
        try {
            if (name != null && price != null) {
                book = new Book();
                book.setName(name);
                book.setPrice(Double.parseDouble(price));
                book.setType(add.getTypeList().getSelectedItem().toString()); //****
                array.addBook(book);
                add.getFr().setVisible(false);
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.DEFAULT_OPTION);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid.");
        }
    }
    
    public BookArray getArray(){
        return array;
    }
}
