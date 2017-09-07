package H04;

/**
 * Created by Oemed on 06-09-17.
 */
import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {
        //stok
        g.setColor(Color.black);
        g.fillRect(50,50,10,200);
        //rood
        g.setColor(Color.red);
        g.fillRect(60,50,120,30);
        //wit
        g.setColor(Color.white);
        g.fillRect(60,80,120,30);
        //blauw
        g.setColor(Color.blue);
        g.fillRect(60,110,120,30);

    }


}



