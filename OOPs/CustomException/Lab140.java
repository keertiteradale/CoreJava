package OOPs.CustomException;

public class Lab140 {
    public static void main(String[] args) throws Exception {
        H h =new H();
        h.process();
    }
}
class H{
    public int process() throws Exception{
        int a = 10/0;
        throw new NullPointerException();
        //return 0;
    }
}