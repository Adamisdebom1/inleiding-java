package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawLine(20,20,100,20);
        g.drawString("lijn", 30,40);

        g.drawRect(20,60,80,40);
        g.drawString("rechthoek",30,120);

        g.drawRoundRect(20,160,80,40,30,30);
        g.drawString("afgeronde rechthoek",10,220);

        g.setColor(Color.magenta);
        g.fillRect(120,60,80,40);
        g.setColor(Color.black);
        g.drawOval(120,60,80,40);
        g.drawString("gevulde rechthoek met ovaal",120,120);

        g.setColor(Color.magenta);
        g.fillOval(120,160,80,40);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal", 140,220);

        g.drawOval(300,60,80,40);
        g.setColor(Color.magenta);
        g.fillArc(300,60,80,40,0,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen", 300,120);

        g.drawOval(320,160,40,40);
        g.drawString("Cirkel",325,220);
    }
}
