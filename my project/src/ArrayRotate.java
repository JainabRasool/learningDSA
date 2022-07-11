import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] aw) {
        int[] arr = new int[]{7, -2, 5, 0, 0};
        int[] a = new int[]{7, -2, 5, 0, 0};
        int[] b = new int[]{7, -2, 5, 0, 0};
        int[] c = new int[]{7, -2, 5, 0, 0};

        System.out.println("Array is:: " + Arrays.toString(arr));

        rightRotate(arr);
        System.out.println("Right rotate is:: " + Arrays.toString(arr));

        leftRotate(a);
        System.out.println("Left rotate is:: " + Arrays.toString(a));


        rightRotate(b, 3);
        System.out.println(" right rotate is:: " + Arrays.toString(b));

        leftRotate(c, 2);
        System.out.println(" left rotate is:: " + Arrays.toString(c));

    }

    public static void rightRotate(int arr[]) {
        int x = arr.length - 1;
        int n = arr[x];
        for (int i = x; i < arr.length && x > 0; i--) {

            if (i - 1 < arr.length) {
                arr[i] = arr[i - 1];
                x--;
            }
        }
        arr[0] = n;
    }

    public static void rightRotate(int arr[], int r) {
        System.out.print(r + " times");
        for (int i = 0; i < r; i++) {

            rightRotate(arr);
        }
    }


    public static void leftRotate(int[] a) {
        int x = 0;
        int n = a[0];
        for (int i = 0; i < a.length; i++) {
            if (i + 1 < a.length)
                a[i] = a[i + 1];
        }
        a[a.length - 1] = n;
    }

    public static void leftRotate(int[] a, int l) {
        System.out.print(l + " times");
        for (int i = 0; i < l; i++) {
            leftRotate(a);
        }
    }
}

