package Multithreading.Challenge.ATM;
import java.util.*;




class ATM{
    synchronized public void checkBalance(String name){
        System.out.print(name + " Checking... ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("Balance");
    }

    synchronized public void withDraw(String name, int amount){
        System.out.println("Name: "+ name +" Withdrawing: "+amount);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}

class Customer_1 extends Thread{
    ATM atm;
//    Scanner sc = new Scanner(System.in);
    String name;
    int amount;

    public Customer_1(ATM atm,String name,int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM(){
        atm.checkBalance(name);
        atm.withDraw(name,amount);
    }

    @Override
    public void run(){
        useATM();
    }



}

class Customer_2 extends Thread{
    ATM atm;
//    Scanner sc = new Scanner(System.in);
    String name;
    int amount;

    public Customer_2(ATM atm,String name,int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM(){
        atm.checkBalance(name);
        atm.withDraw(name,amount);
    }

    @Override
    public void run(){
        useATM();
    }


}


public class ATM_Challenge {
    public static void main(String[] args){
        ATM atm = new ATM();
        Customer_1 c1 = new Customer_1(atm,"Vishnu Narasimhan",3000);
        Customer_2 c2 = new Customer_2(atm,"Uma Narasimhan",30000);
        c1.start();
        c2.start();
    }
}
