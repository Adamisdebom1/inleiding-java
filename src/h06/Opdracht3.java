package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int uitkomst;
    int getaleen;
    int getaltwee;

    public void init(){
    getaleen=2000000000;
    getaltwee=1000000000;

    uitkomst=getaleen+getaltwee;
    }

    public void paint(Graphics g){
        g.drawString(""+uitkomst,20,20);
    }
}
