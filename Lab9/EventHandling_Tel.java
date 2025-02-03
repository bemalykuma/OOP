package Lab9;

import java.awt.event.*;

public class EventHandling_Tel implements ActionListener{
    private TellerGUI gui;

    public EventHandling_Tel(TellerGUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if ( ae.getSource().equals(gui.getB_1() )) {
            this.gui.getBalance().deposit(Integer.parseInt(this.gui.getTxt_input().getText()));
            this.gui.getTxt_fix().setText(this.gui.getBalance().balance+"");
            this.gui.getTxt_input().setText("");
        }
        else if ( ae.getSource().equals(gui.getB_2() )) {
            this.gui.getBalance().withdraw(Integer.parseInt(this.gui.getTxt_input().getText()));
            this.gui.getTxt_fix().setText(this.gui.getBalance().balance+"");
            this.gui.getTxt_input().setText("");
        }
        else if ( ae.getSource().equals(gui.getB_3())) {
            System.exit(0);
        }
    }

}
