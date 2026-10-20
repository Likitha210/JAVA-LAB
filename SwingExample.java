import javax.swing.*;
import java.awt.FlowLayout;

public class SwingExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Swing App");

        JLabel label = new JLabel("Hello!");
        JButton button = new JButton("Click Me");

        button.addActionListener(e ->
            label.setText("Button Clicked!")
        );

        // Set layout before adding components
        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}