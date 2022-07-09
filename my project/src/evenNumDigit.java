public class evenNumDigit {
    public static void  main(String []i){

        int num[]=new int[]{-1,34,1234,-1100,0,-20};
        System.out.println("Num of even digit in an array:: "+countDigit(num));
    }
    public static int countDigit(int a[]){

        int digit=0;


for(int val:a){

    int len = String.valueOf(val).length();
if(val<0){
    val=-(val);
    len= String.valueOf(val).length();
}

    if(len%2==0){
    digit++;}
}
              return digit;
    }
}
