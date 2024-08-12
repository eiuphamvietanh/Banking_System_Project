
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame implements ActionListener {

    private JButton okButton, cancelButton;
    private JPasswordField jPasswordField;
    private JTextField idTextField , nameTextField;
    private JLabel idJLabel, passwordJLabel, welcomeBackJLabel, bankNameJLabel, registerJLabel, nameLabel;
    private User user;
    private Bank bank;
    
    protected int width = 400;
    protected int height = 400;
    protected int xLocation = 400;
    protected int yLocation = 400;
  

    public RegistrationForm() {
        setTitle("Register");
        setSize(width, height);
        setLocation(xLocation, yLocation);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        changeBackGroundColor();
        

        setLayout(null);

        okButton = new JButton("Oke");
        cancelButton = new JButton("Cancle");
        idJLabel = new JLabel("Username");
        passwordJLabel = new JLabel("Password");
        welcomeBackJLabel = new JLabel("You are welcome");
        bankNameJLabel = new JLabel("ABC BANKING SYSTEM");
        registerJLabel = new JLabel("You are registering");

        // add elements
        add(idJLabel);
        add(passwordJLabel);
        add(welcomeBackJLabel);
        add(bankNameJLabel);
        add(registerJLabel);
        add(idTextField = new JTextField());
        add(jPasswordField = new JPasswordField());
        add(okButton);
        add(cancelButton);

        // setBounds the button
        // Label
        idJLabel.setBounds(10, 80, 150, 25);
        passwordJLabel.setBounds(10, 110, 150, 25);
        welcomeBackJLabel.setBounds(10, 40, 200, 25);
        bankNameJLabel.setBounds(160, 40, 200, 25);
        registerJLabel.setBounds(10, 170, 150, 25);
        // TextField
        idTextField.setBounds(160, 80, 200, 25);
        jPasswordField.setBounds(160, 110, 200, 25);
        // JButtion
        okButton.setBounds(160, 140, 200, 25);
        cancelButton.setBounds(160, 170, 200, 25);

        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

        setVisible(true);
    }

    
    public void changeBackGroundColor() {
        Container contentPane = getContentPane();
        Color pastelBlue = new Color(166, 50, 115);
        contentPane.setBackground(pastelBlue);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== okButton) {
            dispose();
            new App();
            
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
