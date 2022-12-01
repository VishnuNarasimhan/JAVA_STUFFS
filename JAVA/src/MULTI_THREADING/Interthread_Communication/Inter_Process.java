package Multithreading.Interthread_Communication;

class My_Data{
    int value;
    boolean flag = true; // If it is true Producer's turn...
                         // If it is false Consumer's turn...
    synchronized public void set(int v){
        while(flag != true)
            try{wait();}catch(Exception e){};
        value = v;
        flag = false;
        notify();

    }
    synchronized public int get(){
        int x;
        while(flag != false)
            try{wait();}catch(Exception e){};
        x = value;
        flag = true;
        notify();
        return x;
    }

}

class Producer extends Thread{
    My_Data data;
    public Producer(My_Data d){
        data = d;
    }
    @Override
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer Value "+ count);
            count++;
        }
    }
}

class Consumer extends Thread{
    My_Data data;
    public Consumer(My_Data d){
        data = d;
    }
    @Override
    public void run(){
        int value;
        while(true){
            value = data.get();
            System.out.println("Consumer Value "+ value);
        }
    }
}

public class Inter_Process {
    public static void main(String[] args){
        My_Data d = new My_Data();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
