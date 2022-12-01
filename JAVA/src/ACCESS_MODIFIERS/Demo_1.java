package Access_Modifiers;

public class Demo_1 {
    int a = 10; // Default Modifier
    private int b = 20; // Private Modifier
    protected int c = 30; // Protected Modifier
    public int d = 40; // Public modifier

    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Demo_2 extends Demo_1{
    void display_2(){
        System.out.println(a);
//        System.out.println(b); // Cannot Access Private
        System.out.println(c);
        System.out.println(d);
    }
}

class Test{
    public static void main(String[] args){
        Demo_1 d = new Demo_1();
        d.display();
    }
}
