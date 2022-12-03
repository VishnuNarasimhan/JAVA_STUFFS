package JAVA_IO_STREAMS._3_BufferedStream;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\File\\Test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
//            byte[] b = new byte[bis.available()];

//            int x;
//            while ((x = bis.read()) != -1) {
//                System.out.print((char) x);
//            }

            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.mark(10);
            System.out.println((char) bis.read());
            bis.reset();
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            fis.close();

//            bis.read(b);
//            String str = new String(b);
//            System.out.println(str);
//            fis.close();


//            //BufferOutputStream
//            FileOutputStream fos = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\File\\Test.txt");
//            BufferedOutputStream bis = new BufferedOutputStream(fos);


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
