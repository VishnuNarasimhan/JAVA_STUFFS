package OOPS.Super;

public class Rectangle {
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;

    Cuboid(int l, int b, int height) {
        super(l, b);
        this.height = height;
    }

    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}





