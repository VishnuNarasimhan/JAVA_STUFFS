package Interfaces;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

public class SmartPhone extends Phone implements  ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("SmartPhone Video Call");
    }
    public void click(){
        System.out.println("SmartPhone Click Photo");
    }

    public void record(){
        System.out.println("SmartPhone record video");
    }

    public void play(){
        System.out.println("SmartPhone play music");
    }
    public void stop(){
        System.out.println("SmartPhone stop music");
    }
}

//public class Interfaces_Main{
//    public static void main(String args[]) {
//        SmartPhone sm = new SmartPhone();
//        sm.record();
//    }
//}