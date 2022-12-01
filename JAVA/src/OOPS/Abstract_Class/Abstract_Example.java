package Abstract_Class;

abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    abstract public void meth1();
}

class Sub extends Super{
    @Override
    public void meth1(){
        System.out.println("Override Abstract method");
    }
}


public class Abstract_Example {
    public static void main(String args[]){
//        Super sc = new Super();
        Sub s = new Sub();
        Super sc = new Sub();
    }
}
