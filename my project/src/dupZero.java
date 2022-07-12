import java.util.Arrays;

public class dupZero {
    public static void main(String[] a) {
        int[] arr = new int[]{1, 0, 2, 4,0,-4,0};
        duplicateZero(arr);
        System.out.println("New array is::" + Arrays.toString(arr));
    }

    public static void duplicateZero(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                rightShift(arr, i + 1);
                i++;
            }
        }

    }

    public static void rightShift(int arr[], int index) {
        int x = arr.length - 1; //4
        if (index < arr.length) {
            for (int i = x; i > index; i--) {

                arr[i] = arr[i - 1];
            }
            arr[index] = 0;
        }
    }
}

