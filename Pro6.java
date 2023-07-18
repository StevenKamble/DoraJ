
import java.awt.*;
import java.awt.event.*;
public class Pro6 implements ActionListener{
    private TextField nameField;
    private Choice genderChoice;
    private TextField emailField;
    private TextField passwordField;
    private Button registerButton;
    private Label resultLabel;
     Frame f;
    Pro6() {
        f=new Frame("Registrartion");
        // Set applet layout and background color
       

        // Create form labels
        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(30, 30, 80, 20);
        f.add(nameLabel);

        Label genderLabel = new Label("Gender:");
        genderLabel.setBounds(30, 60, 80, 20);
        f.add(genderLabel);

        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(30, 90, 80, 20);
        f.add(emailLabel);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(30, 120, 80, 20);
        f.add(passwordLabel);

        // Create form input fields
        nameField = new TextField();
        nameField.setBounds(120, 30, 200, 20);
        f.add(nameField);

        genderChoice = new Choice();
        genderChoice.setBounds(120, 60, 200, 20);
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");
        f.add(genderChoice);

        emailField = new TextField();
        emailField.setBounds(120, 90, 200, 20);
        f.add(emailField);

        passwordField = new TextField();
        passwordField.setBounds(120, 120, 200, 20);
        passwordField.setEchoChar('*');
        f.add(passwordField);

        // Create register button
        registerButton = new Button("Register");
        registerButton.setBounds(120, 150, 80, 30);
        registerButton.addActionListener(this);
        f.add(registerButton);

        // Create result label
        resultLabel = new Label("");
        resultLabel.setBounds(30, 200, 400, 100);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(Color.green);
        f.add(resultLabel);
        f.setSize(600,600);
      
        f.setLayout(null);
          f.setVisible(true);
    }
    public void windowClosing (WindowEvent e) {    
    f.dispose();    
}    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Get form input values
            String name = nameField.getText();
            String gender = genderChoice.getSelectedItem();
            String email = emailField.getText();
            String password = passwordField.getText();

            // Validate the form inputs
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                resultLabel.setText("Please fill in all the fields.");
            } else {
                // Registration logic goes here...
                // You can implement your own logic to store the registration details or perform other actions.
                // For this example, we simply display the registered details in the result label.
                String registrationDetails = "Name: " + name + " | Gender: " + gender + " | Email: " + email;
                resultLabel.setText("Registration successful. Details: " + registrationDetails);
            }
        }
    }
    public static void main(String args[])
    {
        Pro6 p=new Pro6();
    }
}
