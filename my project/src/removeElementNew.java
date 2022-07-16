import java.util.Arrays;

public class removeElementNew {

    public static void main(String[] ar) {
        int[] n = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println("Input array is::" + Arrays.toString(n));
        // removeElement(n, 3);
        System.out.println(removeElement(n, 2));
        //    System.out.println(Arrays.toString(removeElement(n, 3)));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[k] = nums[i];
                k++;
                c++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return c;
    }
}