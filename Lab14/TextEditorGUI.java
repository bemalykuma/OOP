package Lab14;

import java.awt.BorderLayout;
import javax.swing.*;

public class TextEditorGUI {
    private JFrame fr;
    private JTextArea area;
    private JMenuBar mb;
    private JMenu file;
    private JMenuItem create, open, save, close;

    public TextEditorGUI() {
        fr = new JFrame("My Text Editor");
        area = new JTextArea();
        mb = new JMenuBar();
        file = new JMenu("File");
        create = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        fr.setLayout(new BorderLayout());
        fr.add(area);
        fr.add(mb, BorderLayout.NORTH);
        
        mb.add(file);
        file.add(create);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(close);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 350);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public JTextArea getArea() {
        return area;
    }

    public JMenuBar getMb() {
        return mb;
    }

    public JMenu getFile() {
        return file;
    }

    public JMenuItem getCreate() {
        return create;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public JMenuItem getSave() {
        return save;
    }

    public JMenuItem getClose() {
        return close;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public void setFile(JMenu file) {
        this.file = file;
    }

    public void setCreate(JMenuItem create) {
        this.create = create;
    }

    public void setOpen(JMenuItem open) {
        this.open = open;
    }

    public void setSave(JMenuItem save) {
        this.save = save;
    }

    public void setClose(JMenuItem close) {
        this.close = close;
    }
    
    
}
