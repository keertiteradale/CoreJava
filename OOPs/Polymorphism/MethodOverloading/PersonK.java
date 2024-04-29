package OOPs.Polymorphism.MethodOverloading;

public class PersonK {
    //Method overloading - multiple method with same name but diff argument

    void speak(String b)
    {
        System.out.println("B is a String" +b);
    }
    void speak(int b){
        System.out.println("B is a int" +b);
    }
    void speak(double b){ // No return type
        System.out.println("B is a double" +b);
    }

}
