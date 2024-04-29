package OOPs.Interface.InterviewQA3;

public class I2 {
    public static void main(String[] args) {
        System.out.println(PP.a);
        foo f =new foo(); //concrete class
        f.m1();

        PP f1=new foo();//Dynnamic dispatch
        f1.m1();

        rofl f2 = new foo();
        f2.say();



    }

}

interface PP{
    int a = 10; //static variable

    void m1(); //Non Static

}

abstract class rofl implements PP{
    abstract void say();
}
class foo extends rofl{

    @Override
    public void m1() {
        System.out.println("m1");

    }

    @Override
    void say() {
        System.out.println("say!!");

    }
}