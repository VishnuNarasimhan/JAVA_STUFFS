package JAVA_IO_STREAMS._6_FileClass;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\RandomAccess\\Data.txt");
//        System.out.println(f.isDirectory());
//
////        String[] list = f.list();
//        File[] list = f.listFiles();
//        for (File x : list) {
//            System.out.print(x.getName() + " ");
//            System.out.println(x.getPath());
//            System.out.println(x.getParent());
//       }

//        f.setReadOnly();
        f.setWritable(true);
//        System.out.println(f.lastModified());
        FileOutputStream fs = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\RandomAccess\\Data.txt");
    }
}

