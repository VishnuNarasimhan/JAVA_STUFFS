package Multithreading.Thread_and_Runnable;

class My_thread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+" Hello ");
            i++;
        }
    }

}

public class Thread_Test {

    public static void main(String[] args){
        My_thread t = new My_thread();
        t.start();
        int i = 1;
        while(true){
            System.out.println(i+ " World ");
            i++;

        }
    }
}
