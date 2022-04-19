package com.company;
interface  Shape2{
    void  draw();
}
class Circle2 implements  Shape2{
    @Override
    public  void  draw(){
        System.out.println("drawing circle");
    }
}

class  Recangle implements  Shape2 {
    @Override
    public  void  draw(){
        System.out.println("drwaing reactagle");
    }
}
class  Square implements  Shape2{
    @Override
    public void  draw(){
        System.out.println("draing a square");
    }
}

class shapFactory{
   public Shape2 getshap(String shapType){
        if(shapType==null){
            return null;
        }
        if(shapType=="circle"){
            return new Circle2();
        }
        if(shapType=="reacangle"){
            return new Recangle();
        }
        if(shapType=="square"){
            return new Square();
        }
        else {
            return null;
        }
    }
}

public class factorymethod {
    public static void main(String[] args) {
        shapFactory a=new shapFactory();
        Shape2 shape1=a.getshap("circle");
        Shape2 shape2=a.getshap("reacangle");
        Shape2 shape3=a.getshap("square");
        shape3.draw();
        shape2.draw();
        shape1.draw();

    }
}
