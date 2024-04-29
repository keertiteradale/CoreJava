package OOPs.Polymorphism.MethodOverriding;

public class Dog_Lab122 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.bark();

        Hound h =new Hound();
        h.bark();

        Dog f =new Hound(); //Dynamic dispatch //Dog is parent and Hound is child
        f.bark(); //Runtime Polymorphism
    }
}
