import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] a) {
        int arr[] = new int[]{0, 2, 8, -1, 5,0};
        int newArr[]=new int[]{0,2,8,-1,5,0};
        rightShift(arr);


        System.out.println("Right Shift is::"+Arrays.toString(arr));
        leftShift(newArr);
        System.out.println("Left shift is::"+Arrays.toString(newArr));
    }

    public static void rightShift(int arr[]) {
        int x = arr.length - 1; //4

        for (int i = x; i < arr.length && x > 0; i--) {

            if (i - 1 < arr.length) {
                arr[i] = arr[i - 1];

                x--;
                // n++;


            }


        }
        arr[0] = 0;
    }
    public static void leftShift(int arr[]) {
        int x = 0; //4

        for (int i =0; i < arr.length && x< arr.length ; i++) {


            if (i + 1 < arr.length) {
                arr[i] = arr[i + 1];

                x++;
                // n++;


            }


        }
        arr[arr.length-1] = 0;
    }
}


