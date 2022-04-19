package com.company;

class Phone{
    private  String os;
    private  int ram;
    private  String processor;
    private  int battery ;
    private  double screenSize;

    public  Phone (String os,int ram,String processor ,int battery ,double screenSize){
        this.os=os;
        this.ram=ram;
        this.processor=processor;
        this.battery=battery;
        this.screenSize=screenSize;

    }

    public  String Switchon(){
        return  "Phone [os="+os+",ram="+ram+",processor="+processor+",battery="+battery+",screen Size="+screenSize+"]";
    }
}

class PhoneBuilder{
    private  String os;
    private  int ram;
    private  String processor;
    private  int battery ;
    private  double screenSize;
    public  PhoneBuilder setOs(String os){
            this.os=os;
            return  this;
    }

    public  PhoneBuilder setRam(int ram){
        this.ram=ram;
        return  this;
    }

    public  PhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return  this;
    }
    public  PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return  this;
    }

    public  PhoneBuilder setScreenSize(double screenSize){
        this.screenSize=screenSize;
        return  this;
    }
    public  Phone getPhone(){
        return  new Phone(os,ram,processor,battery,screenSize);
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
            Phone p=new PhoneBuilder().setBattery(311).getPhone();
            System.out.println(p.Switchon());
    }
}
