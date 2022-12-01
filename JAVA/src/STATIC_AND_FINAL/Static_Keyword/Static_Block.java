package Static_Keyword;

class Static_Block_Test{
    static {
        System.out.println("Static Block 1");
    }
    static{
        System.out.println("Static Block 2");
    }
}

class Static_Block {
    public static void main(String args[]){

        System.out.println("Main method");
        Static_Block_Test t = new Static_Block_Test();
    }
}
