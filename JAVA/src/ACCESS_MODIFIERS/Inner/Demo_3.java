package Access_Modifiers.Inner;
import Access_Modifiers.Demo_1;

public class Demo_3 extends Demo_1 {
    public void display_3(){
//        System.out.println(a); Default Cannot be Accessible
//        System.out.println(b); Private Cannot be Accessible
        System.out.println(c);
        System.out.println(d);
    }
}

class Demo_4{
    public static void main(String[] args){
        Demo_1 d1 = new Demo_1();
//        System.out.println(d1.a); Default Cannot be Accessible
//        System.out.println(d1.b); Private Cannot be Accessible
//        System.out.println(d1.c); Protected Cannot be Accessible in non-SubClass of Different Package.
        System.out.println(d1.d);

    }

}
