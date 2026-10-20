import javax.swing.*;

public class SwingExample2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Controls");

        JLabel l = new JLabel("Enter your name:");
        l.setBounds(30, 30, 150, 30);

        JTextField t = new JTextField();
        t.setBounds(150, 30, 120, 30);

        JButton b = new JButton("Click Me");
        b.setBounds(100, 80, 100, 30);

        b.addActionListener(e ->
            JOptionPane.showMessageDialog(f,
                "Hello " + t.getText())
        );

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(330, 180);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}