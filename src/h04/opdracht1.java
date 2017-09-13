package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 120, 150, 50);
        g.drawLine(150,50,200,120);
        g.drawLine(100,120,200,120);

    }
}
