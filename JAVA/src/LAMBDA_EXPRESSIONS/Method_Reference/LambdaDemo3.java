package LAMBDA_EXPRESSIONS.Method_Reference;

interface MyLambda {
    public void display(int x, int y);
}

public class LambdaDemo3 {
//    public static void reverse(String str) {
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();
//        System.out.println(sb);
//    }

//    public void add(int x, int y) {
//        System.out.println(x + y);
//    }

    public LambdaDemo3(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
//        MyLambda ml = System.out::println;//:: is known as scope resolution
//        ml.display("Hi Vishnu");
//        MyLambda ml = LambdaDemo3::reverse;
//        ml.display("Hello");

        //By creating Object for non-static method
//        LambdaDemo3 ld = new LambdaDemo3();
//        MyLambda ml = ld::add;

        //By Using Constructor 
        MyLambda ml = LambdaDemo3::new;
        ml.display(0, 20);
    }

}
