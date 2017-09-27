package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double Geld;
    double Geldpp;



    public void init(){
        Geld= 113;
        Geldpp= 113/4.0;


    }

    public void paint(Graphics g){
        g.drawString("Jan: " + Geldpp,20,20);
        g.drawString("ALi: " + Geldpp,20, 40);
        g.drawString("Jeanette: " + Geldpp,20,60);
        g.drawString("Adam: " + Geldpp, 20,  80
        );
    }
}
