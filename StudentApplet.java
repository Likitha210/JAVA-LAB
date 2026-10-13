
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class StudentApplet extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        g.setColor(Color.blue);
        g.drawString("STUDENT DETAILS", 80, 30);

        g.setColor(Color.black);
        g.drawString("Name     : PRIYA", 50, 100);
        g.drawString("Roll No  : 101", 50, 120);
        g.drawString("Branch   : CSE", 50, 140);
        g.drawString("College  : STANFORD UNIVERSITY", 50, 160);

        g.setColor(Color.red);
        g.drawString("Welcome to Java Applet!", 50, 260);
    }
}

