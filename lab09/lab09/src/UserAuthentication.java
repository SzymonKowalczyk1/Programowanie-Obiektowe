public class UserAuthentication implements Authentication{

    private String username;
    private String password;

    public UserAuthentication(String username,String password){
        this.username = username;
        this.password = password;
    }
}
