public class MaxMinArray {

public  static void main(String[] a){

    int[] arr= new int[]{5,-2,-76543,2323232, 1000000,-10000000,0};
    System.out.println("Max val is:"+findMax(arr));
    System.out.println("Min val is:"+findMin(arr));
}

public static int findMax(int a[]) {
    int max = Integer.MIN_VALUE;
    for (int val : a) {
        max = Math.max(max, val);

    }
    return max;
}
public static int findMin(int a[]){
    int min= Integer.MAX_VALUE;
    for(int val:a){
        min=Math.min(min,val);
    }
            return min;
}

}
