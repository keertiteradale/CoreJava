package Arrays;

public class Lab086 {
    public static void main(String[] args) {
        //FizzBuzz Problem:
        //Write a program that prints numbers from 1 to 100
        //For multiples of 3, print "Fizz" instead of the number
        //and for the multiple of 5, print "Buzz"
        //for numbers which are the multiples of both 3 & 5 print "FizzBuzz"

        //1.User input --> No input
        //2. rough code - for(i=1;i<=100;i++)
        //                 if(i%3==0) -- Fizz
        //                  if else(i%5==0) -- Buzz
        //                  is else((i%3==0)&&(i%5==0)) -- Fizz Buzz

        for (int i=1;i<=100;i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
        }
            else if(i%3==0) {
                System.out.println("Fizz");

            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
