package JAVA_IO_STREAMS._1_FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            //File Output
//            FileOutputStream fos = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\File\\Test.txt");
//            String str = "Learn Like hell";
//            byte[] b = str.getBytes();
////            fos.write(b, 2, str.length() - 2);
//            fos.write(b);
////            fos.write(str.getBytes());
//            fos.close();

            //File Input
            FileInputStream fis = new FileInputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\File\\Test.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();


        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
