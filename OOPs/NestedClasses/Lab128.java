package OOPs.NestedClasses;

import OOPs.Interface.RealtimeEx.Engine;

public class Lab128 {

    public static void main(String[] args) {
        Car c =new Car("Lambo");
        c.drive();
        Car.Engine engine = c.new Engine("400CC");
        //engine.start();
        c.drive();
    }
}

class Car{
    String make; //Instance Variable

    //PArameterized Constructor
    public Car(String make){
        this.make = make;
    }

    //Method
    void drive(){
        System.out.println("You can drive a Car");
    }

    public class Engine{
        String HorsePower;

        public Engine(String HorsePower){
            this.HorsePower = HorsePower;
        }
    }
    public class Break{}
    public class accelerator{}

}
