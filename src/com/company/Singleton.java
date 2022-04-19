package com.company;
class ABC{
    static  ABC obj=new ABC();
    private    ABC(){
        System.out.println("hello From Prive Constructor");
    }

    public  static  ABC getInstance(){
        return  obj;
    }
    public void draw(){
        System.out.println("hello ");
    }
}

public class Singleton {
    public static void main(String[] args) {
            ABC a=  ABC.getInstance();
            ABC b=  ABC.getInstance() ;
        ABC c= ABC.getInstance();


    }
}
