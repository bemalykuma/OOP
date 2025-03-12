package Lab14;

import java.io.Serializable;
import java.util.ArrayList;

public class BookArray implements Serializable{
    private ArrayList <Book> bookList;

    public BookArray() {
        bookList = new ArrayList();
        Book book = new Book();
        book.setName("");
        book.setPrice(0);
        book.setType("Default");
        bookList.add(book);
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    public Book getBook(int index) {
        return bookList.get(index);
    }
    
    public int getNumOfBook() {
        return bookList.size();
    }
    
    public void deleteBook(Book b) {
        bookList.remove(b);
    }
    
    
}
