package BasicJava.Conditions_If_IfElse_Switch;

public class Lab049 {
    public static void main(String[] args) {
        int ItemCode = 002;
        switch (ItemCode){
            case 001,002,003:
                System.out.println("Its is electronic prod");
                break;
            case 004,005:
                System.out.println("It is machanical Prod");
                break;
            default:
                System.out.println("Its software");
        }
    }
}
