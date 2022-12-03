package JAVA_IO_STREAMS._9_Serialization;

import java.io.*;

class Student implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Student(int rollno, String name, float avg, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        this.Data = 500;
        this.t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll: " + rollno +
                "\nName: " + name +
                "\nAverage: " + avg +
                "\nDepartment: " + dept +
                "\nData: " + Data +
                "\nTransient: " + t + "\n";
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fo = new FileOutputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\_9_Serialization\\Student.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fo);
//        Student s = new Student(1, "Uma Narasimhan", 96.7f, "CSE");
//        oos.writeObject(s);
//        oos.close();
//        fo.close();

        FileInputStream fi = new FileInputStream("C:\\MyJava\\JAVA\\src\\JAVA_IO_STREAMS\\_9_Serialization\\Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fi);
        Student s;
        s = (Student) ois.readObject();
        System.out.println(s);
        ois.close();
        fi.close();
    }
}
