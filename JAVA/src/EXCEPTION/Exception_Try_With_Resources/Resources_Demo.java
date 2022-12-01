package Exception.Exception_Try_With_Resources;
import java.io.*;
import java.util.*;

class DivisionByZeroException extends Exception{
    public String toString(){
        return "Division By ZERO is not allowed";
    }
}


public class Resources_Demo {
    static void Divide() throws Exception{

        try(FileInputStream fi = new FileInputStream("C:\\Users\\vnarasim\\Desktop\\Numbers.txt");Scanner sc = new Scanner(fi);){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/c);

        }

//        finally {
//        fi.close();
//        sc.close();
//        }
    }
    public static void main(String[] args)  {
       try{
           Divide();
       }
       catch(Exception e){
           System.out.println(e);
        }
//        int x = sc.nextInt();
//        System.out.println(x);
    }
}
