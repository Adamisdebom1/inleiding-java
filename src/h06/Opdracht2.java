package h06;

import java.applet.Applet;
import java.awt.*;

public class  Opdracht2 extends Applet {

    int uur;
    int dag;
    int jaar;


    public void init(){
        uur= 60*60;
        dag= uur*24;
        jaar= dag*365;

    }

    public void paint(Graphics g){
    g.drawString("seconden in uur: "+uur,20,20);
    g.drawString("seconden in dag: "+dag, 20,40);
    g.drawString("seconden in jaar: "+jaar, 20,60);
    }
}