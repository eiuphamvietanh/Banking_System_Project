
public abstract class Account {

    protected String id;
    protected double balance;

    public Account() {

    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -=amount;
        } else{
            System.out.println("Do not have enough money");
        }
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
   

    

}
