package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //declaratie
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;

    public void init() {
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(20,0,20,gewichtValerie);
        g.setColor(Color.blue);
        g.fillRect(100,0,20,gewichtJeroen);
        g.setColor(Color.yellow);
        g.fillRect(180,0,20,gewichtHans);
        g.drawString("Valerie", 20,160);
        g.drawString("Jeroen", 100, 160);
        g.drawString("Hans", 180, 160);
    }
}

