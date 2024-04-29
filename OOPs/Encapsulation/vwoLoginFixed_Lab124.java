package OOPs.Encapsulation;

public class vwoLoginFixed_Lab124 {
    public static void main(String[] args) {
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin", "Admin"); //Hidden

        //boolean check = vwoLogin.isLoggedIn("admin","password");

       // System.out.println(check);

        boolean check2 = vwoLogin.isLoggedIn("admin","admin");
        System.out.println(check2);
        String u = vwoLogin.getUsername();
        {
            System.out.println(u);
        }


    }


}
