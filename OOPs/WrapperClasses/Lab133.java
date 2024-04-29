package OOPs.WrapperClasses;

public class Lab133 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = Integer.valueOf(a);
        //Collection Framework ->Classes -> classes hate primitive data type
        //You have to use the wrapper classes in the collection framework

        Character c2 = 'a';
        char a1= c2; //Unboxing - character object to primitive conversion

        System.out.println(Integer.valueOf(55));
        System.out.println(Integer.max(99,34));
        System.out.println(Integer.reverseBytes(123));

        double d=55.33;
        String st3= String.valueOf(d);
        //Integer st = Integer.valueOf((int) d);
        }

    }

