package Multithreading.Thread_Methods;

class My_Thread extends Thread
{
    public My_Thread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i++ +" My_Thread");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
    }
}

public class Thread_Test {
    public static void main(String[] args) throws InterruptedException {
        My_Thread t = new My_Thread("Thread-1");
//        System.out.println("ID: "+t.getId());
//        System.out.println("Name: "+t.getName());
//        System.out.println("Priority: "+t.getPriority());
//        t.setDaemon(true);
        t.start();
//        Thread main_Thread = Thread.currentThread();
//        main_Thread.join();
//        t.interrupt();
//        System.out.println("State: "+t.getState());
//        System.out.println("ThreadGroup: "+t.getThreadGroup());
//        System.out.println("ISAlive: "+t.isAlive());
//        System.out.println("ISDaemon: "+t.isDaemon());
//        System.out.println("ISInterrupted: "+t.isInterrupted());

        int i = 1;
        while(true) {
            System.out.println(i++ + " Main");
            Thread.yield();
        }

    }
}
