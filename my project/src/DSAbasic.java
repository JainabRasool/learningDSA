public class DSAbasic {

    public static void main(String [] args){
        int number=12345;
        int n= number;
        int len = String.valueOf(n).length();

        int a;
        String b = "";
        int f=10;
      for(int i=0;i<=len-1;i++){
          a=n%f;
          n=n/f;
          b+=a+",";

    }

        System.out.println(b);
    }

}
