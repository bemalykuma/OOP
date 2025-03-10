package Lab13;

import javax.swing.JFrame;

public class MyFramePause {
    private JFrame fr;
    private MyClock3 clock;
    private Thread t;
    private EventHandlingPause ev;

    public MyFramePause() {
        fr = new JFrame("My Clock");
        clock = new MyClock3();
        t = new Thread(clock);
        ev = new EventHandlingPause(clock);
        
        t.start();
        fr.add(clock);
        
        fr.addMouseListener(ev);
        
        fr.setSize(300, 130);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFramePause();
        
    }
    
}
