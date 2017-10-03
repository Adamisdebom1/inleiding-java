package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    Label titel;
    TextField tekstvak;
    Button okeknop;
    double prijs;
    double prijsmetbtw;

    public void init(){

titel= new Label("prijs inclusief btw");
tekstvak= new TextField("prijs",50);
okeknop= new Button("oke");
okeknop.addActionListener(new berekentbtw());

add(titel);
add(tekstvak);
add(okeknop);
    }

    public void paint(Graphics g){
        g.drawString("prijs inclusief btw: "+prijsmetbtw,50,100);

    }



class berekentbtw implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        prijs= Double.parseDouble(tekstvak.getText());
        prijsmetbtw= prijs*1.21;

        repaint();
    }
}

}
