package test6pack;
import java.awt.*;
import java.awt.event.*;

public class LoginApp extends Frame implements ActionListener {
    // Define components
    private Label usernameLabel, passwordLabel, messageLabel;
    private TextField usernameField, passwordField;
    private Button loginButton;

    public LoginApp() {
        // Set frame layout and size
        setLayout(new GridLayout(4, 2));
        setSize(400, 200);
        setTitle("Login Form");

        // Initialize components
        usernameLabel = new Label("Username:");
        passwordLabel = new Label("Password:");
        messageLabel = new Label("");
        usernameField = new TextField();
        passwordField = new TextField();
        passwordField.setEchoChar('*');
        loginButton = new Button("Login");

        // Add components to frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new Label());  // Empty label for spacing
        add(loginButton);
        add(messageLabel);

        // Add action listener to button
        loginButton.addActionListener(this);

        // Close the window when the close button is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // Handle login button click
        String username = usernameField.getText();
        String password = passwordField.getText();
        if (username.equals("user") && password.equals("pass")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new LoginApp();
    }
}