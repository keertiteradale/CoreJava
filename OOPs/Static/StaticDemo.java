package OOPs.Static;

public class StaticDemo {

    //static variable

    public static String College_name = "TheTestingAcademy";

    //Non-static variable --> Local variable or Instance variable

    public int version = 3;

    //Static method
    public static void printhome()
    {
        System.out.println("Name is - " +College_name);
        //you can't have  a Instance variable into the static
        //System.out.println("Version is - " +version); not possible


    }
    //Non static method
     public void printversion()
     {
         System.out.println("Version is -" +version);
         System.out.println("Name is "+College_name);
     }

}
