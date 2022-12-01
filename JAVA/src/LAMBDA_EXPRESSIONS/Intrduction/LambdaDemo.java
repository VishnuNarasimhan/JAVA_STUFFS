package LAMBDA_EXPRESSIONS.Intrduction;

//Lambda Expression only works on Functional Interface.

@FunctionalInterface // Interface which has a single abstract method.
interface MyLambda {
    //    public void display(String S);
    public int add(int x, int y);
}


/*class My implements MyLambda {
    @Override
    public void display() {
        System.out.println("Hi");
    }
}*/

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = (x, y) -> //Lambda Expression
        {
            System.out.println("Hi");
            return x + y;
        };
        System.out.println(m.add(5, 4));
    }
}
