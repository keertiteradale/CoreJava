package OOPs.Constructor;

public class Person {
    public Person(String ref_name) {
        this.name = ref_name;
    }

    String name;
    Person()
    {
        System.out.println("Default Constructor");
    }


    void PrintDetail()
    {
        System.out.println("Your Name is: " +this.name);
    }
}
