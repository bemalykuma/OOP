package Lab13;

import java.awt.FlowLayout;
import javax.swing.*;

public class PoringConstructor {
    private JFrame fr;
    private JButton add;
    private EventHandlingPoringCon ev;

    public PoringConstructor() {
        fr = new JFrame();
        add = new JButton("Add");
        ev = new EventHandlingPoringCon();
        
        add.addActionListener(ev);
        fr.addWindowListener(ev);
        
        fr.setLayout(new FlowLayout());
        fr.add(add);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
}
