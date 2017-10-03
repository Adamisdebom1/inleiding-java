package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {

 String tekst;
TextField tekstvak;
Button okeknop;
Button resetknop;
        Label titel;

    public void init()
    {
        tekst= "deze tekst verandert met oke";
        titel= new Label("recht is een tekstvak");
        add(titel);
        tekstvak= new TextField("vul hier wat in",20);
        add(tekstvak);

        okeknop= new Button();
        okeknop.setLabel("oke");
        KnopListener2 kl2 = new KnopListener2();
        okeknop.addActionListener(kl2);
        add(okeknop);

        resetknop= new Button();
        resetknop.setLabel("reset");
        KnopListener kl = new KnopListener();
        resetknop.addActionListener( kl );
        add(resetknop);
    }
        public void paint(Graphics g){
                g.drawString(tekst,20,50);
        }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            tekst= tekstvak.getText();
            repaint();
        }
    }
}


