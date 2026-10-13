
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorPalette extends Applet implements ActionListener {

    Button red, green, blue, yellow, pink, orange;

    public void init() {
        setLayout(new FlowLayout());

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        yellow = new Button("Yellow");
        pink = new Button("Pink");
        orange = new Button("Orange");

        add(red);
        add(green);
        add(blue);
        add(yellow);
        add(pink);
        add(orange);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        pink.addActionListener(this);
        orange.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            setBackground(Color.red);
        } else if (e.getSource() == green) {
            setBackground(Color.green);
        } else if (e.getSource() == blue) {
            setBackground(Color.blue);
        } else if (e.getSource() == yellow) {
            setBackground(Color.yellow);
        } else if (e.getSource() == pink) {
            setBackground(Color.pink);
        } else if (e.getSource() == orange) {
            setBackground(Color.orange);
        }
    }
}
