package JAVA_DOT_LANG_PACKAGE.Wrapper_Classes;

public class WrapperDemo {
    public static void main(String[] args){
        Integer i = Integer.valueOf(10); // To change the primitive datatype to object and vice versa wrapper classes are used. - BOXING
        int a = i; // - UNBOXING
        // Integer a = Integer.value(10) - Creating Object...
        // Integer a = 10 - AutoBoxing

        // int p = a.intValue(); - Changing to primitive...
        //int p = a - AutoUnboxing
        Float b = (float)Math.sqrt(-1);
        System.out.println(b);
    }
}
