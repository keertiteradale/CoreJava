package OOPs.Interface;

interface FatherKE {
    void loan();

    default void print(){
        System.out.println("Im default method");
    }

    static void print2(){
        System.out.println("I'm static method");
    }
}
