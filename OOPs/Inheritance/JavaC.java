package OOPs.Inheritance;

public class JavaC extends Programming2_Lab119 {
    String newfeature;

    JavaC()        //default Constructor
    {
        System.out.println("Java default constructor");
    }
    JavaC(String feature){
        this.newfeature = feature;
    }

    void  PrintInfo(){
        System.out.println("Feature is --> " +this.newfeature);
    }
    void car()
    {
        System.out.println("LAmbo");
    }
    void Property(){
        System.out.println("3BHK");
    }
}
