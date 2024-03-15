package Arrays;

public class Lab088 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        //2D
        int[][] arr= new int[3][3];
        int arr2[][]=new int[3][3];

        //row 0 to 2
        arr[0][0]=12;
        arr[0][1]=34;
        arr[0][2]=23;

        //Initializing 2nd array /2nd row
        arr[1][0]=22;
        arr[1][1]=45;
        arr[1][2]=55;

        //Initializing 3rd array
        arr[2][0]=67;
        arr[2][1]=35;
        arr[2][2]=51;

        for (int i=0;i<a.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
