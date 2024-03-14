package Continue;

public class Lab066 {
    public static void main(String[] args) {
        //Continue - if this is true then continue
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
            if(i==5)
                continue;
                System.out.println("After");
        }
    }
}
