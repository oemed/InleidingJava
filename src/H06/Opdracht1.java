package H06;

/**
 * Created by Oemed on 07-09-17.
 */
import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double a,b,uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("Ik krijg: $" + uitkomst , 20, 20);
        g.drawString("Jan krijgt: $" + uitkomst , 20, 35);
        g.drawString("Ali krijgt: $" + uitkomst , 20, 50);
        g.drawString("Jeanette krijgt: $" + uitkomst , 20, 65);



    }
}