package Parametarised_Constructor;

public class Grandchild extends Child {
    public Grandchild() {
        System.out.println("No-Param of Grandchild");
    }
    public Grandchild(int x, int y, int z) {
        super(x,y);
        System.out.println("Param Grandchild "+ z);
    }
}
