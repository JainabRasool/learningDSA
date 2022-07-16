import java.util.Arrays;

public class maxSubArraySum {

    public static void main(String[] ar) {
        int[] n = new int[]{1, 4, 0, 2, -3};
        System.out.println("Provided array is:: " + Arrays.toString(n));
        MaxSumSubArray(n);
    }

    public static void MaxSumSubArray(int[] n) {
        int i = 0, j = i + 1;
        int max = Integer.MIN_VALUE;
        int S = 0;
        String SumString = "";
        for (int k = 0; k < n.length; k++) {
            while (j < n.length) {
                if (i == 0 && j == n.length - 1) {
                    break;
                } else {
                    S = sum(n, i, j);
                    SumString += S + " ";
                    j++;
                }
            }
            i++;
            j = 0;
            j = i + 1;

        }
        System.out.println("Max Sum is of subArray is:: " + MaxSum(SumString));
    }


    public static int sum(int[] n, int index1, int index2) {
        int sum = 0;
        for (int k = index1; k <= index2; k++) {
            sum += n[k];
        }
        int max = Integer.MIN_VALUE;
        System.out.println("Sum of subArray from index " + index1 + " to index " + index2 + " is::" + sum);
        return sum;
    }

    public static int MaxSum(String s) {
        String ss[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        for (String val : ss) {
            max = Math.max(max, Integer.parseInt(val));
        }
        return max;
    }
}
