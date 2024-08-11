
public abstract class Account {
    private String id;
    private double balance;
    private String password;


    public Account() {
    }


    

    public Account(String id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public void deposit(double amount){
        balance +=amount;
    }
    
    public void withdraw(double amount){
        balance -=amount;
    }


    public String getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + "]";
    }




    public abstract void transferMoney(Account checkingAccount, double i);




   




    
    
    
    

}
