class Test{

    int a;
    int b;

    Test(int x, int y){
        this.a=x;
        this.b=y;
        display();
    }
    public static void main(String args[]){

        Test t = new Test(2,5);


    }
public void display(){
    System.out.println("a::"+a+":b:"+b);
}
}
