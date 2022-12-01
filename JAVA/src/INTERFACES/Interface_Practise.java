package Interfaces;

interface Test{
    void meth1();
    void meth2();
}

class Test_2 implements Test{
    @Override
    public void meth1(){
        System.out.println("meth1 of class Test_2");
    }
    @Override
    public void meth2(){
        System.out.println("meth2 of class Test_2");
    }
    public void meth3(){
        System.out.println("meth3 of class Test_2");
    }
}

public class Interface_Practise {
    public static void main(String args[]){
        Test t1 = new Test_2();
        t1.meth1();
        t1.meth2();
//        t1.meth3();
    }
}
