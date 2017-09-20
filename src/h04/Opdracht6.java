package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(40,20,40,60);
        g.drawLine(60,80,60,160);
        g.drawOval(55,30,10,10);
        g.drawOval(55,45,10,10);
        g.drawOval(55,60,10,10);

    }
}