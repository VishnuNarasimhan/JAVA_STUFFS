package JAVA_IO_STREAMS._8_DataStream;

import java.io.*;

class Student {
    int rollNo;
    String name;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fo = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\DataStream\\Student.txt");
//        DataOutputStream do = new DataOutputStream(fo);
//        Student s = new Student();
//        s.rollNo = 20;
//        s.name = "Vishnu Narasimhan";
//        s.dept = "ECE";
//        do.writeInt(s.rollNo);
//        do.writeUTF(s.name);
//        do.writeUTF(s.dept);
//        do.close();
//        fo.close();

        FileInputStream fi = new FileInputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\DataStream\\Student.txt");
        DataInputStream di = new DataInputStream(fi);
        Student s = new Student();
        s.rollNo = di.readInt();
        s.name = di.readUTF();
        s.dept = di.readUTF();
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Student Name: " + s.name);
        System.out.println("Department: " + s.dept);
        di.close();
        fi.close();

    }
}
