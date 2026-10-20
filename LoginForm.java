import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    public LoginForm() {
        setTitle("Login Form");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel(""));
        add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password =
                    new String(passwordField.getPassword());
                if (username.equals("admin")
                        && password.equals("1234")) {
                    JOptionPane.showMessageDialog(
                        LoginForm.this,
                        "Login Successful!"
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        LoginForm.this,
                        "Invalid Username or Password!"
                    );
                }
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}

