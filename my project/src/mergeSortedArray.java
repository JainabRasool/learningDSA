import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String a[]) {

        int nums1[] = new int[]{1, 2, 0, 0, 0, 0};
        int nums2[] = new int[]{1, 5, 6, 7};

        merge(nums1, 2, nums2, 4);
        System.out.println("Merged sorted array: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1; //i=3
        int j = n-1; // j=3
        for (int k = nums1.length - 1; k > -1; k--) {
            if (i > -1 && j > -1) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            } else {
                if (i < 0 ) {
                    nums1[k] = nums2[j];
                    j--;
                }
                else {
                    nums1[k] = nums1[i];
                    i--;
                }

            }
        }
    }

}
