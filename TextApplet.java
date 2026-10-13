
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TextApplet extends Applet implements ActionListener {

    TextField tf;
    Label l;
    String msg = "";

    public void init() {
        setLayout(new FlowLayout());
        setBackground(Color.MAGENTA);

        Label title = new Label("Enter Your Text:");
        title.setFont(new Font("Times New Roman", Font.BOLD, 16));
        add(title);

        tf = new TextField(20);
        tf.setFont(new Font("Serif", Font.PLAIN, 16));
        add(tf);

        l = new Label("Press Enter to display text");
        l.setFont(new Font("Arial", Font.ITALIC, 14));
        add(l);

        tf.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = tf.getText();
        l.setText("You entered: " + msg);
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.yellow);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Displayed Text: " + msg, 50, 150);
    }
}

