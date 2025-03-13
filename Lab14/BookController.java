package Lab14;

import java.awt.event.*;
import java.io.File;
import javax.swing.JOptionPane;

public class BookController implements ActionListener, WindowListener {

    private BookView view;
    private BookArray array;
    private int index = 0;
    private BookAddController ar;
    private String type;
    private Book book;
    private BookFile bookFile;

    public BookController() {
        view = new BookView();
        array = new BookArray();
        bookFile = new BookFile();
        view.getAdd().addActionListener(this);
        view.getUpdate().addActionListener(this);
        view.getDelete().addActionListener(this);
        view.getLeft().addActionListener(this);
        view.getRight().addActionListener(this);
        view.getFr().addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getAdd())) {
            ar = new BookAddController(array);
        } else if (e.getSource().equals(view.getUpdate())) {
            if (index == 0) {
                view.getTxtNum().setText(index + "");
                view.getTxtName().setText(array.getBook(index).getName());
                view.getTxtPrice().setText("");
                view.getTypeList().setSelectedItem("Default");

            } else {
                String price = view.getTxtPrice().getText();
                String name = view.getTxtName().getText();
                try {
                    if (name != null && price != null) {
                        array.getBook(index).setName(name);
                        array.getBook(index).setPrice(Double.parseDouble(price));
                        array.getBook(index).setType(view.getTypeList().getSelectedItem().toString()); //****
                        JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.DEFAULT_OPTION);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid.");
                }
                type = array.getBook(index).getType();
                view.getTxtNum().setText(index + "");
                view.getTxtName().setText(array.getBook(index).getName());
                view.getTxtPrice().setText(array.getBook(index).getPrice() + "");
                view.getTypeList().setSelectedItem(type);
            }

        } else if (e.getSource().equals(view.getDelete())) {
            if (array.getNumOfBook() > 1) {
                array.deleteBook(array.getBook(index));
                index--;
                if (index > 0) {
                    type = array.getBook(index).getType();
                    view.getTxtNum().setText(index + "");
                    view.getTxtName().setText(array.getBook(index).getName());
                    view.getTxtPrice().setText(array.getBook(index).getPrice() + "");
                    view.getTypeList().setSelectedItem(type);
                } else if (index == 0 && array.getNumOfBook() > 1) {
                    index++;
                    type = array.getBook(index).getType();
                    view.getTxtNum().setText(index + "");
                    view.getTxtName().setText(array.getBook(index).getName());
                    view.getTxtPrice().setText(array.getBook(index).getPrice() + "");
                    view.getTypeList().setSelectedItem(type);
                } else {
                    view.getTxtNum().setText(index + "");
                    view.getTxtName().setText("");
                    view.getTxtPrice().setText("");
                    view.getTypeList().setSelectedItem("Default");
                }
                JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.DEFAULT_OPTION);
            }

        } else if (e.getSource().equals(view.getLeft())) {
            if (index > 0) {
                index--;
                type = array.getBook(index).getType();
                view.getTxtNum().setText(index + "");
                view.getTxtName().setText(array.getBook(index).getName());
                view.getTxtPrice().setText(array.getBook(index).getPrice() + "");
                view.getTypeList().setSelectedItem(type);
                if (index == 0 && array.getNumOfBook() > 0) {
                    type = array.getBook(1).getType();
                    view.getTxtNum().setText(1 + "");
                    view.getTxtName().setText(array.getBook(1).getName());
                    view.getTxtPrice().setText(array.getBook(1).getPrice() + "");
                    view.getTypeList().setSelectedItem(type);
                    index++;
                } else if (index == 0) {
                    view.getTxtNum().setText(index + "");
                    view.getTxtName().setText("");
                    view.getTxtPrice().setText("");
                    view.getTypeList().setSelectedItem("Default");
                }
            }
        } else if (e.getSource().equals(view.getRight())) {
            if (index < array.getNumOfBook() - 1) {
                index++;
                type = array.getBook(index).getType();
                view.getTxtNum().setText(index + "");
                view.getTxtName().setText(array.getBook(index).getName());
                view.getTxtPrice().setText(array.getBook(index).getPrice() + "");
                view.getTypeList().setSelectedItem(type);
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("Book.data");
        if (f.exists()) {
            array = bookFile.loadData();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if (array.getNumOfBook() > 1) {
            bookFile.saveData(array);
        }
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
