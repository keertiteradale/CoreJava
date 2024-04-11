package OOPs.Constructor;

public class BankAccount_Lab116 {
    public static void main(String[] args) {
        //BankAccount sbi = new BankAccount(); //Default Constructor
        //sbi.PrintDetail(); // call default constructor

        BankAccount hdfc = new BankAccount("HDFC");
        hdfc.PrintDetail();
    }
}
