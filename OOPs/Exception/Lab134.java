package OOPs.Exception;

public class Lab134 {
    public static void main(String[] args) {
        try {
            String name =null;
            name.trim();//NullPointerException if you are trying without try catch
            System.out.println("I am Keerti");

    }catch (Exception e){
            System.out.println("You are trying to trim a null string that is");
        }
        System.out.println("Hi I am the end!!");
}}
