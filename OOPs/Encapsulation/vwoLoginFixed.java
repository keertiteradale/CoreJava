package OOPs.Encapsulation;

public class vwoLoginFixed {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    vwoLoginFixed(String u, String P)
    {
        this.password=P;
        this.username=u;
    }
    boolean isLoggedIn(String username,String password)
    {
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged In!!");
            return true;
        }
        else
        {
            System.out.println("Wrong");
            return false;
        }
    }
}
