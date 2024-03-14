package Conditions_If_IfElse_Switch;

public class Lab050 {
    public static void main(String[] args) {
        int ItemCode= 002;
        switch (ItemCode)
        {
            case 001 -> System.out.println("Its a Laptop");
            case 002 -> System.out.println("Its a Desktop");
            case 003 -> System.out.println("Its a Mobile Phone");
            default -> System.out.println("Hello");
        }
    }
}
