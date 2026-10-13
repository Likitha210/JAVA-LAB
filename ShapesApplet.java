
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class ShapesApplet extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.blue);
        g.drawString("Different Shapes", 100, 30);

        g.setColor(Color.red);
        g.drawRect(30, 50, 100, 60);

        g.setColor(Color.green);
        g.fillOval(170, 50, 80, 60);

        g.setColor(Color.blue);
        g.drawOval(30, 140, 70, 70);

        g.setColor(Color.magenta);
        g.drawLine(150, 140, 250, 210);

        g.setColor(Color.black);
        g.drawString("Rectangle", 40, 125);
        g.drawString("Filled Oval", 170, 125);
        g.drawString("Circle", 35, 230);
        g.drawString("Line", 190, 230);
    }
}
