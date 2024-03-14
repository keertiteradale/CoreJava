package Loops;

public class Lab065 {
    public static void main(String[] args) {
        //int a =10;
        //if(a==10){
        //Break;
    //} not valid syntax, cant use break with if condition
        for(int i=0;i<10;i++)
        {
            if(i==10)
            {
                break;
            }//now it is valid syntax because here we have used for loop and
            // for loop we can use break,it should be within loop
        }
    }
}
