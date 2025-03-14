package Lab13;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandlingPause implements MouseListener{

    private MyClock3 clock = new MyClock3();

    public EventHandlingPause(MyClock3 clock) {
        this.clock = clock;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        clock.continueTime();
    }
        
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
