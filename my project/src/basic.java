public class basic {
    public static void main(String [] args){
        int number=12345;
        int n1=12345,n= 12345;
        int len = String.valueOf(n).length();
        int x ,y,z,a;
        int d=10000;
        int f=10;
        String num="",revNum="";

        for(int i=0;i<=len-1;i++){
            x=n/d;
            y= n%d;
            n=y;
            d=d/10;
            num+=x+",";

            a=n1%f;
            n1=n1/f;
            revNum+=a+",";


        }
        System.out.println("input number is::"+number);
        System.out.print("num as char is::"+num);
        System.out.println( );
        System.out.print("num as revNum is::"+revNum);
    }

}
