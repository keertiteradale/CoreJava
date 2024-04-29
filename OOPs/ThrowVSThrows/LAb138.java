package OOPs.ThrowVSThrows;

import java.io.FileReader;

public class LAb138 {
    public static void main(String[] args) {
        int a=10/0; //Unchecked - JVM dont know
        try {
            FileReader f = new FileReader("C://a.txt"); //Checked
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
