import javax.swing.*;
import java.util.Arrays;

public class mergeArrayInNewSortedArray {
    public static void main(String a[]) {


        int nums1[] = new int[]{-1,0,3,5,1000};
        int nums2[] = new int[]{-1000,0,2,4};


        System.out.println("Merged sorted array: " + Arrays.toString( merge(nums1, nums2)));
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int nums3[]=new int[n];
        int i=0,j=0;

        for(int k=0;k<n;k++){
            if (i < nums1.length && j< nums2.length) {
            if(nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                j++;
            }
            else {
                nums3[k] = nums1[i];
                i++;
            }
            }
            else {
                if (i >= nums1.length ) {
                    nums3[k] = nums2[j];
                    j++;
                }
                else {
                    nums3[k] = nums1[i];
                    i++;
                }
            }
        }

       return nums3;
    }
}
