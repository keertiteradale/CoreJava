package OOPs.Interface.InterviewQA2;

public class II {
    public static void main(String[] args) {
        System.out.println(M.a);
        System.out.println(M.b);
    }
}

interface M{
    //Only static variable
    // In interface variables are always static, even if static keyword is not mentioned
    int a =10;
    int b =20;
    void m1();
}
