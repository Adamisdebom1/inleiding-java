package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(20,50,60,50);
        g.drawLine(20,50,40,20);
        g.drawLine(40,20,60,50);
        g.drawRect(20,50,40,50);
        g.drawRect(20,80, 10,20);
        g.drawRect(40,80,10,10);
    }
}