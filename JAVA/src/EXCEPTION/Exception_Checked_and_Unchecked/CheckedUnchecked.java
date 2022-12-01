package Exception.Exception_Checked_and_Unchecked;
//import java.io.*;

class LowBalanceException extends Exception{
    @Override
    public String toString(){
        return "Balance should not be less than 5000";
    }
}
public class CheckedUnchecked {
    static void fun1(){
//        try{
//            System.out.println(10/0);
//
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

//        FileInputStream f1 = new FileInputStream("My.txt");
        try{
            throw new LowBalanceException();
        }catch(LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args){
        fun3();
    }
}
