public class SavingsAccount extends Account {

    private double [] interestRate = {0.7,0.5,0.3,0.1};
    private int periodOfDepositTime ;

    
    
    public SavingsAccount() {
    }



    public SavingsAccount(String id, double balance, int periodOfDepositTime) {
        super(id, balance);
        this.periodOfDepositTime = periodOfDepositTime;
    }
    


    
    

    

}
