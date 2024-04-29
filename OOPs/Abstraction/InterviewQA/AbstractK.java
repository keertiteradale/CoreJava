package OOPs.Abstraction.InterviewQA;

public class AbstractK {
}

abstract class PersonPa{
    abstract void say(); //incomplete method
    void eat(){ // complete method
        System.out.println("Hello eat from Person");
    };
}
abstract class StudentPa extends PersonPa{
abstract void m2();
}

class KeertiPa extends StudentPa{

    @Override
    void say() {

    }

    @Override
    void m2() {

    }
}