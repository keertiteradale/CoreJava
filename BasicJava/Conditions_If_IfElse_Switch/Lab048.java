package BasicJava.Conditions_If_IfElse_Switch;

public class Lab048 {
    public static void main(String[] args) {
        byte b=20;
        switch (b){
            case 10:
                System.out.println("TEN");
            case 120:
                System.out.println("One Twenty");
            default:
                System.out.println("diff condition mentioned in switch");
                // Not executed, no conditions matches. b=20 and in switch condition both are diff
                //so here if we add default, it will execute
        }
    }
}
