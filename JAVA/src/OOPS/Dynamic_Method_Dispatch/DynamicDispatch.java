package Dynamic_Method_Dispatch;

class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}

class Sub extends Super{
    @Override
    public void meth1(){
        System.out.println("sub Meth1");
    }
    @Override
    public void meth2(){
        System.out.println("sub Meth2");
    }
    public void meth3(){
        System.out.println("sub Meth3");
    }
}


public class DynamicDispatch {
    public static void main(String args[]){
        Super s = new Sub();
        s.meth1();
        s.meth2();
//        s.meth3();
    }

}

