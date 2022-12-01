package Inheritance;

class Inheritance {
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Inheritance {
    public double height;
    public double volume(){
        return area() * height;
    }

}

class Inheritance_1 {
    public static void main(String args[]){
        Cylinder c2 = new Cylinder();
        c2.radius = 7;
        c2.height = 10;
        System.out.println("Area of Circle: "+ c2.area());
        System.out.println("Volume of Cylinder: "+ c2.area() +" * "+c2.height+" = "+c2.volume());
    }
}