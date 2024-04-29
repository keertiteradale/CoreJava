package OOPs.Access_Modifier.Police;

import OOPs.Access_Modifier.Police.Cop;

public class JrCop {
    public static void main(String[] args) {
        Cop cop = new Cop(2);
        System.out.println(cop.gun);
        cop.canIshoot(); // protected for Police folder
    }
}
