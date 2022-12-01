import java.sql.SQLOutput;

public class Main {

    void max(int Start,String ...names)
    {
        for(int i = 0;i<names.length;i++){
            System.out.println(Start+". "+ names[i]);
            Start++;
        }
    }

    public static void main(String args[]) {
        for(int i = 0;i< args.length;i++){
            System.out.println(args[i]);
        }
//        Main main = new Main();
//        main.max(0,"Vishnu","Maha","Manu","Pril","Hari");
    }

//    void update(int A)
//    {
//        A = 25;
//    }
//
//    public static void main(String[] args) {
//        int A = 20;
//        Main main = new Main();
//        main.update(A);
//        System.out.print(A);
//    }
}