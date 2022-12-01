package Methods;

class Circle1{

    public double radius;
    public double area(){
        return Math.PI * radius *radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }

}


public class Circle {


    public double radius;

    public static void main(String args[]){
        Circle1 c1 = new Circle1();
        c1.radius = 4;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
    }
}

