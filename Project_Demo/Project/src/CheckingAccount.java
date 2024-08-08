public class CheckingAccount extends Account {

    private double overDraftLimit;

    public CheckingAccount(String id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public void transferMoney(Account toAccount, double amount){
        this.withdraw(amount);
        toAccount.deposit(amount);

    }

    @Override
    public String toString() {
        return "CheckingAccount [id=" + id + ", overDraftLimit=" + overDraftLimit + ", balance=" + balance + "]";
    }

    

    

}
