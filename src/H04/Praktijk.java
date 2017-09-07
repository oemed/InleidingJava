package H04;

/**
 * Created by Oemed on 07-09-17.
 */
import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {

    public void init () {

    }

    public void paint (Graphics g) {
        //lijn
        g.drawLine(20,20,120,20);

        //rechthoek
        g.drawRect(20,40,100,30);

        //afgeronde rechthoek
        g.drawRoundRect(20,80,100,30,30,20);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(130,20,100,40);
        g.setColor(Color.black);
        g.drawOval(130,20,100,40);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(130,70,100,40);

        //taartpunt met ovaal
        g.setColor(Color.black);
        g.drawOval(240,20,100,40);
        g.setColor(Color.magenta);
        g.fillArc(240,20,100,40,0,45);

        //cirkel
        g.setColor(Color.black);
        g.drawOval(250,70,60,60);






    }


}

