
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

public class App extends JFrame implements ActionListener {
   private JButton jLoginButton, jRegisterButton;
   private JPasswordField jPasswordField;
   private JTextField idTextField;
   private JLabel idJLabel, passwordJLabel, welcomeBackJLabel, bankNameJLabel, registerJLabel;
   
   private int width = 400;
   private int height = 400;
   private int xLocation = 400;
   private int yLocation = 400;





    
    public App() {

        setTitle(" HuVa Banking System");
        setSize(width, height);
        setLocation(xLocation, yLocation);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // changeBackGroundColor();
        
        setLayout(null);

        jLoginButton = new JButton("Login");
        jRegisterButton = new JButton("Register");
        idJLabel = new JLabel("Username");
        passwordJLabel = new JLabel("Password");
        welcomeBackJLabel = new JLabel("WELCOME BACK");
        bankNameJLabel = new JLabel("ABC BANKING SYSTEM");
        registerJLabel = new JLabel("Click here to register");
        
        // add elements
        add(idJLabel);
        add(passwordJLabel);
        add(welcomeBackJLabel);
        add(bankNameJLabel);
        add(registerJLabel);
        add(idTextField =new JTextField());
        add(jPasswordField = new JPasswordField());
        add(jRegisterButton);
        add(jLoginButton);
        
        
        //setBounds the button
        // Label 
        idJLabel.setBounds(10, 80, 150, 25);
        passwordJLabel.setBounds(10, 110, 150, 25);
        welcomeBackJLabel.setBounds(10, 40, 200, 25);
        bankNameJLabel.setBounds(160,40, 200, 25);
        registerJLabel.setBounds(10, 170, 150, 25);
        // TextField
        idTextField.setBounds(160, 80, 200, 25);
        jPasswordField.setBounds(160, 110, 200, 25);
        // JButtion
        jLoginButton.setBounds(160, 140, 200, 25);
        jRegisterButton.setBounds(160, 170, 200, 25);

        
        

        
       
        setVisible(true);
}

        public void changeBackGroundColor(){
            Container contentPane = getContentPane();
            Color pastelBlue = new Color(176, 212, 184);
            contentPane.setBackground(pastelBlue);
        }
    



    public static void main(String[] args) throws Exception {
        new App();
        
        User user = new User("84564", "Viet Anh", "65464");
        Bank banks = new Bank();


        banks.addUser(user);
        Account checkingAccount = new CheckingAccount(user.getId(), 1000, user.getPassword());

        user.addAccount(checkingAccount);
        System.out.println();
        User user1 = new User("1234", "Quang Huy", "1234");
        banks.addUser(user1);
        Account checkingAccount1 = new CheckingAccount(user1.getId(), 1000, user1.getPassword());
        user.addAccount(checkingAccount1);
        checkingAccount1.transferMoney(checkingAccount, 500);
        System.out.println(checkingAccount.toString());
        System.out.println(checkingAccount1.toString());
        
        

      
        
       
        
    }






    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
