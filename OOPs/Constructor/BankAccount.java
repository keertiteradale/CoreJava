package OOPs.Constructor;

public class BankAccount {
    public BankAccount(String hdfc) {
        this.Bankname = hdfc;

       // Bankname = "sbi";
        //System.out.println("I am default");
    }

    String Bankname;
    int balance;

    void PrintDetail()
    {
        System.out.println("Bank Name --> " +Bankname);
        System.out.println("Balance --> " +balance);
    }
}
