package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    Button vrouw;
    Button man;
    Button potentielevrouw;
    Button potentieleman;
    Label tekst;
    String aantal;

    public void init(){
        setSize(500, 500);
        tekst = new Label("test");
        aantal = "test";
    vrouw= new Button("klik hier voor het aantal vrouwen");
    vrouw.addActionListener( new KnopListener1());

    man= new Button("klik hier voor het aantal mannen");
    man.addActionListener(new KnopListener2());

    potentielevrouw= new Button("klik hier voor het aantal potentiele vrouwelijke leerlingen");
    potentielevrouw.addActionListener(new KnopListener3());
    potentieleman= new Button("klik hier voor het aantal potentiele mannelijke leerlingen");
    potentieleman.addActionListener(new KnopListener4());
    add(vrouw);
    add(man);
    add(potentielevrouw);
    add(potentieleman);
        add(tekst);



    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst.setText("aantal vrouwen is 50");

            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst.setText("aantal mannen is 30");

            repaint();
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst.setText("aantal potentiele vrouwen is 60");

            repaint();
        }
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst.setText("aantal potentiele mannen is 70");

            repaint();
        }
    }

}

