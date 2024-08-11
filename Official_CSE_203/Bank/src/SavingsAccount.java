import java.util.Arrays;

public class SavingsAccount extends Account {
    private double [] interestRate ={0.7, 0.5, 0.3, 0.1};
    private int periodOfTime;


    public SavingsAccount() {
    }


    


    public SavingsAccount(String id, double balance, String password, int periodOfTime) {
        super(id, balance, password);
        this.periodOfTime = periodOfTime;
    }


    @Override
    public String toString() {
        return "SavingsAccount [interestRate=" + Arrays.toString(interestRate) + ", periodOfTime=" + periodOfTime
                + ", getId()=" + getId() + ", getBalance()=" + getBalance() + "]";
    }





    @Override
    public void transferMoney(Account checkingAccount, double i) {
       System.out.println("Cant not transfer");
    }

    

    

    

}
