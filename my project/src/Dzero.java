import java.util.Arrays;

public class Dzero {
    public static void main(String[] a) {
        int[] arr = new int[]{1, 0, 2, 0, 0, 4, 0};
        System.out.println("New array is::" + Arrays.toString(duplicateZero(arr)));
    }

    public static int[] duplicateZero(int[] arr) {
        int[] newArry = new int[arr.length];
        // {1,0,2,0,0,4,0}
        int x = 0;
        for (int i = 0; i < arr.length && x < newArry.length; i++) {
            if (arr[i] == 0) {

                newArry[x] = arr[i];
                if (x + 1 < newArry.length)
                    newArry[x + 1] = arr[i];
                x = x + 2;
            } else {
                newArry[x] = arr[i];
                x++;

            }
        }


        return newArry;
    }


}

