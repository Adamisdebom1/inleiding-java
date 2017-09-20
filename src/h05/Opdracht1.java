package h05;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 80;
        hoogte = 40;
    }

    public void paint(Graphics g) {

        g.setColor(lijnkleur);

        g.drawLine(20,20,100,20);
        g.drawString("lijn", 30,40);

        g.drawRect(20,60, breedte,hoogte);
        g.drawString("rechthoek",30,120);

        g.drawRoundRect(20,160,breedte,hoogte,30,30);
        g.drawString("afgeronde rechthoek",10,220);

        g.setColor(opvulkleur);
        g.fillRect(120,60,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(120,60,breedte,hoogte);
        g.drawString("gevulde rechthoek met ovaal",120,120);

        g.setColor(opvulkleur);
        g.fillOval(120,160,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("gevulde ovaal", 140,220);

        g.drawOval(300,60,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(300,60,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("taartpunt met ovaal eromheen", 300,120);

        g.drawOval(320,160,40,hoogte);
        g.drawString("Cirkel",325,220);
    }
}
