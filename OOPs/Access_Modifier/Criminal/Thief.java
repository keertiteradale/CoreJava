package OOPs.Access_Modifier.Criminal;

import OOPs.Access_Modifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
       // cop.canIshoot();
    }
}
