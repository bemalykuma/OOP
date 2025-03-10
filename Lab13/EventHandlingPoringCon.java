package Lab13;

import java.awt.event.*;

public class EventHandlingPoringCon implements ActionListener, WindowListener {

    private Poring por;
    private static int count;
    private Thread t;

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        por = new Poring();
        por.getCount().setText(count + "");
        t = new Thread(por);
        t.start();

    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
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
