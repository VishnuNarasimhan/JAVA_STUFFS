package LocalInner;

public class Outer {
    public void display(){
         class Inner
         {
             public void show(){
                 System.out.println("Hello");
             }
         }
         Inner i = new Inner();
         i.show();
    }

}

class LocalInner{
    public static void main(String args[]){
        Outer o = new Outer();
        o.display();
    }
}

//class Outer
//{
//    int x=10;
//    static int y=20;
//
//    static class My
//    {
//        public void show()
//        {
//            System.out.println(y);
//        }
//    }
//
//
//}
//
//public class LocalInner
//{
//    public static void main(String[] args)
//    {
//        Outer.My m=new Outer.My();
//        m.show();
//
//    }
//
//}
