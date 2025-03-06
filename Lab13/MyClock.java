package Lab13;

import java.awt.*;
import java.io.*;
import java.util.Calendar;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
            try {
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src//Lab13//fonts//mini_pixel-7.ttf")).deriveFont(75f);
                setFont(customFont);
            } catch (IOException | FontFormatException e) {
                e.printStackTrace();
                setFont(new Font("Dialog", Font.BOLD, 59));
            }
            
            setHorizontalAlignment(SwingConstants.CENTER);
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
