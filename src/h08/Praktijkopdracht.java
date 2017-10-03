package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField eerstevak;
    TextField tweedevak;
    Button plusknop;
    Button minknop;
    Button vermedigvuldigknop;
    Button deelknop;

    double getaleen;
    double getaltwee;
    double totaal;


    public void init(){
        eerstevak= new TextField("getal 1",10);
        tweedevak= new TextField("getal 2",10);

        plusknop= new Button("+");
        plusknop.addActionListener(new optellen());

        minknop= new Button("-");
        minknop.addActionListener(new aftrekken());

        vermedigvuldigknop= new Button("*");
        vermedigvuldigknop.addActionListener(new vermedigvuldigen());

        deelknop= new Button("/");
        deelknop.addActionListener(new delen());

        add(eerstevak);
        add(tweedevak);
        add(plusknop);
        add(minknop);
        add(vermedigvuldigknop);
        add(deelknop);

    }

    public void paint(Graphics g){



    }


class optellen implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        getaleen= Double.parseDouble(eerstevak.getText());
        getaltwee= Double.parseDouble(tweedevak.getText());
        totaal= getaleen+getaltwee;
        eerstevak.setText(String.valueOf(totaal));
        tweedevak.setText("");
        repaint();
    }
}
    class aftrekken implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaleen= Double.parseDouble(eerstevak.getText());
            getaltwee= Double.parseDouble(tweedevak.getText());
            totaal= getaleen-getaltwee;
            eerstevak.setText(String.valueOf(totaal));
            tweedevak.setText("");
            repaint();
        }
    }
    class vermedigvuldigen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaleen= Double.parseDouble(eerstevak.getText());
            getaltwee= Double.parseDouble(tweedevak.getText());
            totaal= getaleen*getaltwee;
            eerstevak.setText(String.valueOf(totaal));
            tweedevak.setText("");
            repaint();
        }
    }
    class delen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getaleen= Double.parseDouble(eerstevak.getText());
            getaltwee= Double.parseDouble(tweedevak.getText());
            totaal= getaleen/getaltwee;
            eerstevak.setText(String.valueOf(totaal));
            tweedevak.setText("");
            repaint();
        }
    }
}
