package Exception.Exception_Throw_vs_Throws;

class NegativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Dimensions Should not be negative";
    }
}

public class ThrowThrows {
    static int area(int l,int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException {
        System.out.println(area(10,-1));
    }

    public static void main(String[] args){
        try{
            meth1();
        }catch(NegativeDimensionException e){
            System.out.println(e);
        }
    }
}
