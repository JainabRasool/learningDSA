public class arrayTest {

static String name="zainab";
int age;
int mobile=786;
    public static void main(String[] a){

        int []arr= new int[]{1,2,3,4};

        for ( int i:arr) {
            System.out.println("i::"+i+" ");
            print(i); //SENDING 1
            System.out.println("I::"+i+" ");
            print(arr); // sending {1,2,3,4},{10,20,3,4},{10,20,3,4}
            System.out.println();
            System.out.println("*************************************");
        }
arrayTest at=new arrayTest();

        System.out.println("ORIGINAL MOBILE:"+at.mobile+" ");
        at.age=26;
        at.mobile=789;
        System.out.println("BEFORE CHANGE:::");
        System.out.print("NAME:"+at.name+" "+"AGE:"+at.age+" "+"MOBILE:"+at.mobile+" "); //zainab ,26,789
        print(at);
        System.out.println();
        System.out.println("AFTER CHANGE:::");
        System.out.print("NAME:"+at.name+" "+"AGE:"+at.age+" "+"MOBILE:"+at.mobile+" "); //RASOOL ,27,123

print(at,1);
    }

    public static void print(int a[]){
        a[1]=20; // {1,20,3,4}
        for (int num:a) {
            System.out.print(num+" "); // {1,20,3,4},{10,20,3,4}

            a[0]=10; // {10,20,3,4}
        }
    }
    public static void print(int a){ //a=1
        a=20; //a=20
        System.out.println("a::"+a+" "); //a=20 for every action
    }
    public static void print(arrayTest art){
       art.age=27;
       art.mobile=123;
       art.name="RASOOL";

    }

    public static void print(arrayTest art,int a){
       arrayTest tt = new arrayTest();
        System.out.println();
        System.out.println("FOR OBJECT tt");
        System.out.print("NAME:"+tt.name+" "+"AGE:"+tt.age+" "+"MOBILE:"+tt.mobile+" "); //Rasool ,0,786
tt.mobile=987;
tt.name="NABEEL";
        System.out.println();
        System.out.println("FOR OBJECT tt MOBILE after change:"+tt.mobile+":NAME::"+tt.name); //987 , NABEEL
        System.out.println("FOR OBJECT art MOBILE after change:"+art.mobile+":NAME::"+art.name); //123, NABEEL
    }

}


