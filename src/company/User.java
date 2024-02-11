package company;

public class User {
    String username;
    String password;
    boolean inSession;

    public void User(){
        this.username = "danny";
        this.password = "danny";
        this.inSession = false;
    }

    public void login(String user, String pw){
        this.username = user;
        this.password = pw;
        this.inSession = true;
    }
}