package Multithreading.Thread_and_Runnable;

//class My_Thread implements Runnable{
//
//}

public class Runnable_Test implements Runnable {
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i +" Uma");
            i++;
        }
    }
    public static void main(String[] args){
        Runnable_Test m = new Runnable_Test();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(true){
            System.out.println(i +" Vishnu");
            i++;
        }
    }
}
