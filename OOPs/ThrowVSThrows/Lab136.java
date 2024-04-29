package OOPs.ThrowVSThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab136 {
    public static void main(String[] args) throws Exception{

    }
    static void readfile(String filename) throws Exception
    {
        File f=new File(filename);
        FileReader fileReader = new FileReader(filename);
        if(filename.length()==0){
            throw new FileNotFoundException();
        }
        System.out.println("Not vul code");
    }
}
