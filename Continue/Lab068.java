package Continue;

public class Lab068 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0){
                System.out.println("Even of " +i);
                continue;
            }
            System.out.println("ODD of "+i);
        }
    }
}
