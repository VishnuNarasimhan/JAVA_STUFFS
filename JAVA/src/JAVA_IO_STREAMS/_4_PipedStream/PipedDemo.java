package JAVA_IO_STREAMS._4_PipedStream;

import java.io.*;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer " + count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (IOException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();

                System.out.println("Consumer " + x);
                System.out.flush();

                Thread.sleep(10);
            } catch (IOException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class PipedDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
