package OOPs.ThrowVSThrows;

public class Lab137 {
    public static void main(String[] args) throws Exception
    {
        main("Keerti");

    }
    static void main(String a) throws Exception{
        if(a.equalsIgnoreCase("a")){
            throw new ArithmeticException();
        }
    }
}
