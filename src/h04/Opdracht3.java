package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.setColor(Color.white);
        g.drawLine(20, 20, 20, 160);
        g.setColor(Color.red);
        g.fillRect(20, 20, 60, 20);
        g.setColor(Color.white);
        g.fillRect(20, 40, 60, 20);
        g.setColor(Color.blue);
        g.fillRect(20, 60, 60, 20);
    }
}
