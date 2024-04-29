package OOPs.Interface.InterviewQA;

public class II1 {
    public static void main(String[] args) {
        hello h = new hello();
        h.say();
        h.hello();

        II I = new hello();
        I.hello();

    }
}


interface II{
    void say();

    default void hello(){
        System.out.println("Hello Default");
    }
}

interface I{
}

class hello implements II{

    @Override
    public void say() {
        System.out.println("Say!!");

    }

    @Override
    public void hello() {
        II.super.hello();
        System.out.println("Hello");
    }
}