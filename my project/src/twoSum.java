import java.util.Arrays;

public class twoSum {
    public static void main(String[] ar) {
        int[] n = new int[]{0, 4, -3, 2, -5};
        System.out.println("Input array is::" + Arrays.toString(n));
        int a = -1;
        System.out.println("Index of targeted sum " + a + " is::" + Arrays.toString(indexOftwoSum(n, a)));
    }

    public static int[] indexOftwoSum(int[] n, int a) {
        int arr[] = new int[2];
        int i = 0, j = i + 1;
        for (int k = 0; k <= n.length; k++) {
            if (n[i] + n[j] == a) {
                arr[0] = i;
                arr[1] = j;
            } else {
                if (j <= n.length - 2) {
                    j++;
                } else {
                    i++;
                    j = i + 1;
                    k = 1;
                }
            }
        }

        return arr;

    }

}
