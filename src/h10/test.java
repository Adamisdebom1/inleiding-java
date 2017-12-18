package h10;

import java.applet.Applet;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class test extends Applet {

    Label label;
    TextField tekstvak;
    Button knop;
    int getal1;
    int getal2;
    String tekst;
    int getal3;

    public void init() {

        label = new Label("voer een getal in");
        tekstvak = new TextField("", 5);
        knop = new Button("oke");

        knop.addActionListener(new grootsteGetal());

        add(label);
        add(tekstvak);
        add(knop);


    }

    public void paint(Graphics g) {
        g.drawString("grootste getal:" + getal2, 50, 50);
        g.drawString("laagste getal:" + getal3, 50, 70);

    }


    class grootsteGetal implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            getal1 = Integer.parseInt(tekst);
            if (getal1 > getal2) {
                getal2 = getal1;
                repaint();
            } else if (getal1<getal3) {
                    getal3 = getal1;


        }
        }

    }
}