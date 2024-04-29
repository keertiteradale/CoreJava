package OOPs.Inheritance;

public class Programming2_Lab119 {
    public static void main(String[] args) {
        Programming2_Lab119 p = new Programming2_Lab119();
        JavaC J = new JavaC();
        Programming2_Lab119 p1= new JavaC(); //Psooble, parent can access child

        //JavaC J2 = new Programming2_Lab119(); //Not possible. cjild ref cant have parent object
        JavaC J1= new JavaC();
        J1.car();
        J1.Property();
    }
}
