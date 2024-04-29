package OOPs.NestedClasses;

public class Lab129 {
    public static void main(String[] args) {
        KeertiTer1 K = new KeertiTer1();
        KeertiTer1.IPad pi = K.new IPad();
        pi.eating();
    }
}

class KeertiTer1{
    int age = 30; //Data member or Instance variable

    //Methods
    void say(){
        System.out.println("I am eating");
    }

    class IPad{
        void eating(){
            System.out.println("I am IPad");
            System.out.println(age);

        }
    }
}
