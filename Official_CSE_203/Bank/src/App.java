public class App {
    public static void main(String[] args) throws Exception {
        
        User user = new User("84564", "Viet Anh", "65464");
        Bank bank = new Bank();


        bank.addUser(user);
        Account checkingAccount = new CheckingAccount(user.getId(), 1000, user.getPassword());

        user.addAccount(checkingAccount);
        System.out.println();
        System.out.println( checkingAccount.getBalance());

        User user1 = new User("1234", "Quang Huy", "1234");
        Bank bank1 = new Bank();


        bank.addUser(user1);
        Account checkingAccount1 = new CheckingAccount(user.getId(), 1000, user.getPassword());

        checkingAccount1.transferMoney(checkingAccount, 500);

        System.out.println(checkingAccount.getBalance());
        System.out.println(checkingAccount1.toString());
        
        

      
        
       
        
    }
}
