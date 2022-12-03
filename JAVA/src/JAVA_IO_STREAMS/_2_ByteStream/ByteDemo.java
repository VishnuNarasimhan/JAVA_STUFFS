package JAVA_IO_STREAMS._2_ByteStream;

import java.io.*;

public class ByteDemo {
    public static void main(String[] args) throws IOException {

//        //ByteArrayInputStream
//        byte[] b = {'V', 'I', 'S', 'H', 'N', 'U'};
//        ByteArrayInputStream bi = new ByteArrayInputStream(b);
//
//        int x;
//        while ((x = bi.read()) != -1) {
//            System.out.print((char) x);
//        }
//        System.out.println(bi.markSupported());
//        bi.close();

        //ByteArrayOutputStream
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        bo.write('H');
        bo.write('i');
        bo.write(' ');
        bo.write('V');
        bo.write('i');
        bo.write('s');
        bo.write('h');
        bo.write('n');
        bo.write('u');


//        byte[] b = bo.toByteArray();
//        for (byte x : b)
//            System.out.print((char) x);
        bo.writeTo(new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\File\\Test.txt"));

        bo.close();
    }
}
