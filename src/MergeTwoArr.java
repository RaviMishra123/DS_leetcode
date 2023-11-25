import java.util.Arrays;

public class MergeTwoArr {
    public static void main(String[] args) {
        int [] arr1 = new int[]{ 1, 5, 6, 4, 7, 2 };
        int [] arr2 = new int[]{ 12, 8, 9, 13, 15,16 };
        int [] arr3 = new int[arr1.length + arr2.length];
        mergeTwoArr(arr1, arr2, arr3);
        System.out.println();
        if(arr3.length % 2 != 0){
            int i = arr3[(arr3.length) / 2];
            System.out.println("median of sorted arr is : " + i);
        }
        else {
            double i = (arr3[(arr3.length / 2 - 1)] + arr3[(arr3.length/2)]) / 2.0;
            System.out.println("median of sorted arr is :" + i);
        }
    }

    private static void mergeTwoArr(int[] arr1, int[] arr2, int [] arr3) {
        int i=0, j=0, k=0;
        while (i < arr1.length){
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length){
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);
        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l] + " ");
        }
    }
}
