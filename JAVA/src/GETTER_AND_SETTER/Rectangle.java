package Getter_And_Setter;

class Rectangle_1{
    private int length;
    private int breadth;

    void Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setLength(int l){
        if (l>0){
            length = l;
        }
        else{
            length = 0;
        }
    }
    public void setBreadth(int b){
        if (b>0){
            breadth = b;
        }
        else{
            breadth = 0;
        }
    }

    public int area(){
        return length * breadth;
    }
}

public class Rectangle {

    public static void main(String args[]){
        Rectangle_1 obj = new Rectangle_1();
        obj.setLength(-10);
        obj.setBreadth(40);
        System.out.println(obj.area());
        System.out.println(obj.getLength());
        System.out.println(obj.getBreadth());

    }
}

