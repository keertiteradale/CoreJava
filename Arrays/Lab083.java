package Arrays;

public class Lab083 {
    public static void main(String[] args) {
        int[] int_array={1,2,4,54};
        float f[]={5.6f,34.4f,34.5f,0.3f};
        double d[]={5.5,4,5.8,9};
        boolean b[]={true,false};
        char c[]={'A','B','C'};
        String name[]={"Keerti","Digvijay","PAtil"};

        System.out.println(int_array.length);
        System.out.println(name.length);

        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]+f[i]);
        }
    }
}
