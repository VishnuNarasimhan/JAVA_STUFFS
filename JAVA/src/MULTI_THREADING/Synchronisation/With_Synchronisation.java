package Multithreading.Synchronisation;

class My_data{
   synchronized void display(String str){
//        synchronized (this){

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
//        }
    }
}

class My_Thread_1 extends Thread{
    My_data d;
    My_Thread_1(My_data dat)
    {
        d = dat;
        System.out.println("dat "+dat);
        System.out.println("d "+d);
    }
    @Override
    public void run(){
        d.display("Hello World");
    }
}

class My_Thread_2 extends Thread{
    My_data data;
    My_Thread_2(My_data dat)
    {
        data = dat;
        System.out.println(data);
    }
    @Override
    public void run(){
        data.display(" Welcome");
    }
}

public class With_Synchronisation {
    public static void main(String[] args){
    My_data d = new My_data();
    My_Thread_1 t1 = new My_Thread_1(d);
    My_Thread_2 t2 = new My_Thread_2(d);
    t1.start();
    t2.start();

    }

}
