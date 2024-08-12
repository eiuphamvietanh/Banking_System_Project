import java.util.ArrayList;

public class User {

    private String id;
    private String name;
    private String password;
    public static ArrayList <Account> accounts = new ArrayList<>();

    public User() {
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void removeAccount(Account account){
        accounts.contains(account);
        

    }
    public void addAccount(Account account){
        accounts.add(0, account);
        
    }

    public boolean containsAccount(String id, String password){

        for(Account account : accounts){
            if(account.getId().equals(id)& account.getPassword().equals(password)){
                System.out.println("Successful");
                return true;
            }
        }
        return false;

    }

    

    

    
}
