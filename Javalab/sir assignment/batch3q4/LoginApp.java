import java.awt.*;
import java.awt.event.*;

public class LoginApp extends Frame implements ActionListener {
    TextField usernameField, passwordField;
    Label usernameLabel, passwordLabel, messageLabel;

    public LoginApp() {
        setTitle("Login Form");
        setSize(600, 400);
        setLayout(new FlowLayout());

        usernameLabel = new Label("Username:");
        usernameField = new TextField(20);

        passwordLabel = new Label("Password:");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Set password field to show asterisks

        Button loginButton = new Button("Login");
        loginButton.addActionListener(this);

        messageLabel = new Label("");
        messageLabel.setForeground(Color.RED);
        messageLabel.setAlignment(Label.CENTER);

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Username and password cannot be empty.");
        } else if (username.equals("Sayantan") && password.equals("abc123")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        loginApp.setVisible(true);
    }
}
