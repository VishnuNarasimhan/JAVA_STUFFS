package Nested_Inner_Class;

public class Outer {
    int x = 10;
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }
   public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
   }
}

class Test{
    public static void main (String args[]){
//        Outer o = new Outer();
//        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.y);
//        System.out.println(oi.x);
    }
}
