package Arrays;

public class Lab080 {
    public static void main(String[] args) {
int[] arr1={1,2,3,4,5};
int[] arr2={1,2,3,4,5};
        System.out.println(arr1==arr2);//false because 2 diff array arr1 and arr2so its not equal
        //lenght is equal but stored separately(memory allocation)

        int[] arr3 = arr1;
        System.out.println(arr3==arr1);
        System.out.println(arr3.equals(arr2));

        //If string ->True Why -Value
        //Arrays -> Compare  don't ->Ref - not equal
    }
}
