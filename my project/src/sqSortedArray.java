import java.util.Arrays;

public class sqSortedArray {
    public  static  void main(String a[]){
     int[] arr= new int[]{-4,1,999,0};

        System.out.println(Arrays.toString(SqSortArray(arr)));
    }
    public static int[] SqSortArray(int[] a){
        int SqSortAry[] = new int[a.length];
        int sq=0;
        
        for(int i=0;i<a.length;i++){
            sq=a[i]*a[i];

            SqSortAry[i]+=sq;

        }
        Arrays.sort(SqSortAry);
        return SqSortAry;
    }


}
