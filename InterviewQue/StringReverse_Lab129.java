package InterviewQue;

public class StringReverse_Lab129 {
    public static void main(String[] args) {
        String name= "Keerti";
        String reverse ="";
        for (int i=name.length() -1;i>=0;i--)
        {
            reverse =reverse+name.charAt(i);
        }
        System.out.println(reverse);
    }
}
