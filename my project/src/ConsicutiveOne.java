public class ConsicutiveOne
{
    public static void main(String a[]) {
        int[] num=new int[]{1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(num));
    }
        public static int findMaxConsecutiveOnes(int[] nums) {
            int MaxCount=0,count=0;

            for(int val:nums){
                if(val==1){
                    count++;
                    MaxCount=count; }
                else
                    count=0;
            }
            return MaxCount;
        }

}
