package OOPs.Problems;

public class Lab101 {
    public static void main(String[] args) {
        int[][] array_2d= new int[3][3];
        for (int i=0; i<array_2d.length; i++) {
            //System.out.println(array_2d[i][i]);

            for (int j = 0; j < array_2d[i].length; j++) {
                if (i == j) {
                    System.out.println(array_2d[i][j]);
                } else {
                    array_2d[i][j] = 0;
                    System.out.println("\t" + array_2d[i][j]);
                }
            }
        }
    }
}


