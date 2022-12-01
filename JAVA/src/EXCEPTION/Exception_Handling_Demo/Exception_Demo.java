package Exception.Exception_Handling_Demo;
import java.util.*;

public class Exception_Demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Values: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        try{
//            int c =  a/b;
//            System.out.println(c);
//        }catch(ArithmeticException e){
//            System.out.println("Denominator Should not be 0, Try Again");
//        }
//        System.out.println("Bye");

        int A[] = {10,2,3,4,0};
        try{
            int c = A[0]/A[2];
            System.out.println(c);
            try
            {
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
//                System.out.println("Index is Invalid");
                e.printStackTrace();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");

    }
}
