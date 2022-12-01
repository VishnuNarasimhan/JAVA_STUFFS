package Static_Keyword;

public class Test {
    static int x = 10;
    int y = 20;

    void show(){
        System.out.println("x = "+x+" "+"y = "+y);
    }
    static void display(){
        System.out.println("x = "+x);
    }

}
class Static_Practise{
    public static void main (String args[]){
        Test t1 = new Test();
        t1.show();
        t1.x = 1;
        t1.y = 2;



        Test t2 = new Test();
        t2.show();

        Test t3 = new Test();
        t3.y = 50;
        t3.show();

    }
}
