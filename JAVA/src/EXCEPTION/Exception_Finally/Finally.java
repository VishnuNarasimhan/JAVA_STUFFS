package Exception.Exception_Finally;

public class Finally {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Final Message");
    }
}
