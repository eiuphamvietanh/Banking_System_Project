public class CheckingAccount extends Account {
 
    private double overDraftLimit = 1000;

    public CheckingAccount() {
    }

    
    public CheckingAccount(String id, double balance, String password) {
        super(id, balance, password);
    }


    @Override
    public String toString() {
        return "CheckingAccount [overDraftLimit=" + overDraftLimit + ", getId()=" + getId() + ", getBalance()="
                + getBalance() + "]";
    }


    @Override
    public void transferMoney(Account toAccount, double amount) {
        this.withdraw(amount);
        toAccount.deposit(amount);
        
    }

    
    


}
