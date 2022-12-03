package JAVA_IO_STREAMS.PrintStream_and_Serialization;

import java.io.*;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fo = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\PrintStream\\Student.txt");
//        PrintStream ps = new PrintStream(fo);
//        Student s = new Student();
//        s.rollNo = 1;
//        s.name = "Vishnu N";
//        s.dept = "ECE";
//        ps.println(s.rollNo);
//        ps.println("Student Name: " + s.name);
//        ps.println("Department: " + s.dept);
//        ps.close();
//        fo.close();

        FileInputStream fi = new FileInputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\PrintStream\\Student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));
        Student s = new Student();
        s.rollNo = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println("Roll No: " + s.rollNo + ", " + s.name + ", " + s.dept);
        br.close();
        fi.close();
    }
}
