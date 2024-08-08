public class User {

    private String id;
    private String name;
    private String passwords;

    public User() {
    }

    public User(String id, String name, String passwords) {
        this.id = id;
        this.name = name;
        this.passwords = passwords;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createAccount(Account account){

    }

    public void removeAccount(Account account){
        
    }

    

    

}
