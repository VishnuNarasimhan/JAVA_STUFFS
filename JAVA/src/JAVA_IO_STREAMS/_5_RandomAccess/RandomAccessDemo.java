package JAVA_IO_STREAMS._5_RandomAccess;

import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\RandomAccess\\Data.txt", "rw");
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        System.out.println((char) raf.read());
        raf.write('d');
        System.out.println((char) raf.read());
        raf.skipBytes(3);
        System.out.println((char) raf.read());
        raf.seek(3);
        System.out.println((char) raf.read());
        System.out.println(raf.getFilePointer());
        raf.seek(raf.getFilePointer() + 2);
        System.out.println((char) raf.read());

    }
}
