package JAVA_DOT_LANG_PACKAGE.ENUM;

enum Dept {
    CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Srinivas", "Block C"), ECE("Dave", "Block D");

    String head;
    String location;

    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }

    /**
     * @return
     */

    public String getHeadName() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class enumDemo {
    public static void main(String[] args) {
        Dept d = Dept.ECE;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());

//        Dept list[] = Dept.values();
//
//        for (Dept x : list)
//            System.out.println(x);
    }
}
