package Parametarised_Constructor;

public class Child extends Parent {
    public Child() {
        System.out.println("No-Param of Child");
    }
    public Child(int x, int y) {
        super(x);
        System.out.println("Param of Child " + y);
    }
}
