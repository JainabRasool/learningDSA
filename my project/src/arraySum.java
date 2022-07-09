import java.util.Arrays;

public class arraySum {
    public static void main(String[] a){
        int arr[]=new int[]{1,4,2,9,0,11};
        System.out.println("Sum of digit Before index:"+Arrays.toString(calSumBeforeIndex(arr)));
        System.out.println("Sum of digit After index:"+Arrays.toString(calSumAfterIndex(arr)));
    }

    public static int[] calSumBeforeIndex(int[] a){
        int sum[] = new int[a.length];
        sum[0]=a[0];
        for(int i=1;i<a.length;i++){
            sum[i]=sum[i-1]+a[i];
        }
        return  sum;
    }
    public static int[] calSumAfterIndex(int[] a){
        int n =a.length;
        int sum[] = new int[n];

        sum[0]=sum(a);

        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]-a[i-1];
        }
        return  sum;
    }
public static int sum(int a[]){
        int sum=0;
        for (int val:a){
            sum+=val;
        }
     return  sum;
}
}
