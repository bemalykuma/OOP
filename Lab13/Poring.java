package Lab13;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Poring implements Runnable {

    private JFrame fr;
    private JLabel poring, count;
    private ImageIcon image;
    private EventHandlingPoring ev;
    private Random rand;
    private int maxX;
    private int maxY;

    public Poring() {
        fr = new JFrame();
        poring = new JLabel();
        count = new JLabel("0");
        image = new ImageIcon("src\\Lab13\\images\\poring.png");
        ev = new EventHandlingPoring(this);
        rand = new Random();

        Image scaledImage = image.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        fr.setLayout(new FlowLayout());
        poring.setIcon(scaledIcon);
        fr.add(poring);
        fr.add(count);

        poring.addMouseListener(ev);

        fr.setSize(220, 170);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        maxX = screenSize.width - fr.getWidth();
        maxY = screenSize.height - fr.getHeight();
        int x = rand.nextInt(maxX + 1);
        int y = rand.nextInt(maxY + 1);

        fr.setLocation(x, y);

        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public JLabel getPoring() {
        return poring;
    }

    public ImageIcon getImage() {
        return image;
    }

    public EventHandlingPoring getEv() {
        return ev;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setPoring(JLabel poring) {
        this.poring = poring;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public void setEv(EventHandlingPoring ev) {
        this.ev = ev;
    }

    public void setCount(JLabel count) {
        this.count = count;
    }

    public JLabel getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int dx = rand.nextInt(11) - 5;
                int dy = rand.nextInt(11) - 5;

                int tempX = fr.getX() + dx;
                int tempY = fr.getY() + dy;

                final int newX = Math.max(0, Math.min(tempX, maxX));
                final int newY = Math.max(0, Math.min(tempY, maxY));

                SwingUtilities.invokeLater(() -> fr.setLocation(newX, newY));

                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
