import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bank {
    
    private ArrayList <User> users = new ArrayList<>();
    private ArrayList <Account> accounts = new ArrayList<>();
    private double balance;


    public Bank() {

    }
    public void addUser(User u){

    }
    
    public boolean findUser(User u){
      return true;
    }

    public void loadUsersFromFile(File file){

    }

    public void saveUsersToFile(File file){

    }

    public void addAccount(Account account){

    }
    public void loadAccountFromFile(Account account){

    }
    public void saveAccountToFile(Account account){
        
    }
    public void removeAccount(Account account){

    }

    private void setBalance(Account toAccount, double amount){
           balance += amount;
    }
    
}
