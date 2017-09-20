package h04;

import java.applet.Applet;
import java.awt.*;


public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint (Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawRect(20, 20, 100, 100);
        g.drawOval(50, 50, 10, 10);
        g.drawOval(80, 50, 10, 10);
        g.drawOval(50, 80, 10, 10);
        g.drawOval(80,80,10,10);
    }



}
