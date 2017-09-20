package h04;

import java.applet.Applet;
import java.awt.*;

public class OPdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(20,100,20,40);
        g.setColor(Color.blue);
        g.fillRect(100,40,20,100);
        g.setColor(Color.yellow);
        g.fillRect(180,60,20,80);
        g.drawString("Valerie", 20,160);
        g.drawString("Jeroen", 100, 160);
        g.drawString("Hans", 180, 160);
    }
}
