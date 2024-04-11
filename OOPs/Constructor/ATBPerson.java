package OOPs.Constructor;

public class ATBPerson {
    String name;
    long Phone;
    String mail;

    void talk()
    {
        System.out.println("Talk");
    }
    void PrintDetail()
    {
        System.out.println(name); //o/p: Null
        System.out.println(Phone); //o/P: 0
        System.out.println(mail); //O/P: Null
        //default values are assigned but in main method. when you assign local
        //variable String s;
        // System.out.println(s);
    }
}
