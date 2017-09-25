package H06;

import java.applet.Applet;
import java.awt.*;


public class Opdracht3 extends Applet {
    int uitkomst;

    public void init() {
        uitkomst = 2 + 2;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}