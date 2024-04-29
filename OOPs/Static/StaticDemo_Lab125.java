package OOPs.Static;

public class StaticDemo_Lab125 {
    public static void main(String[] args) {

        System.out.println(StaticDemo.College_name);

        StaticDemo.printhome();

        StaticDemo s1 = new StaticDemo();
        s1.version = 199;
        s1.printversion();

        StaticDemo s2 = new StaticDemo();
        s2.version = 299;
        s2.printversion();



    }
}
