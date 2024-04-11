package OOPs.Constructor;

public class Dog {
    String name; //Instance Variable

    Dog()   //Default Constructor
    {
        System.out.println("Default Constructor");
    }
    Dog(String Nameref)
    {
        this.name =Nameref;
        System.out.println("Paramiterized Constructor");
    }

    void bark()
    {
        int age =10; //Local Variable
        //System.out.println("Bark");
        System.out.println("Dog name is --> " +this.name);
    }
}
