package OOPs.CollectionFramework;

public class GenericsLab160 {

    public static void main(String[] args) {
        temp("Keerti");
        temp("Patil");
        temp(133);
        temp(3.420);
        printfun(3,4);

    }

    public static<t> void temp(t x){
        System.out.println(x);
    }

    public Integer max(Integer x,Integer y){
        if(x>y){
            return x;
        }
        else {
            return y;
        }

    }
    public static <T> void printfun(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }

}
