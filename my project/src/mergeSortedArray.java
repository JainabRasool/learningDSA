import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String a[]) {

        int nums1[] = new int[]{1, 2, 0, 0, 0, 0};
        int nums2[] = new int[]{1, 5, 6, 7};

        merge(nums1, 4, nums2, 4);
        System.out.println("Merged sorted array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = nums1.length - 1;
        int i = a - m;

        for (int k = a; k > m && m > i; k--) {
            for (int j = nums2.length - 1; j > -1; j--) {
                if (nums2[j] > nums1[i]) {
                    nums1[k] = nums2[j];
                } else {
                    nums1[k] = nums1[i];
                    nums1[i] = nums2[j];
                    k--;
                }
                k--;
            }
            m--;
        }
    }

}
