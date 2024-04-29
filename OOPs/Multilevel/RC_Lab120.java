package OOPs.Multilevel;

public class RC_Lab120 {
    public static void main(String[] args) {
        GrandFather g= new GrandFather();
        g.bhk3();
        Father f = new Father();
        f.bhk2();
        f.bhk3();
        Son s = new Son();
        s.bhk3();
        s.bhk1();
        s.bhk2();
        GrandFather g1= new Son();//Valid
        g1.bhk3();
        Father f1= new Son(); // Valid
        f1.bhk2();
        //Son s2= new GrandFather(); // Invalid
        //Son s3 = new Father(); //Invalid
    }
}
