package Lab14;

import java.io.*;

public class BookFile {

    public void saveData(BookArray book) {
        try (FileOutputStream fOut = new FileOutputStream("Book.data"); ObjectOutputStream oOut = new ObjectOutputStream(fOut)) {
            oOut.writeObject(book);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public BookArray loadData() {
        try (FileInputStream fin = new FileInputStream("Book.data"); ObjectInputStream oin = new ObjectInputStream(fin)) {
            return (BookArray) oin.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
