package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50,50,40,50,0, 360);

    }
}
