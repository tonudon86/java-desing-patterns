package com.company;

interface  Pen{
    void  write(String str);
}
class  AssingmentWork{
    private  Pen p;

    public void setP(Pen p) {
        this.p = p;
    }

    public Pen getP() {
        return p;
    }
    public void writeAssignment(String str){
    p.write(str);
    }
}
class PilotPen{
    public  void  mark(String str){
        System.out.println(str);
    }
}

class PenAdaptor implements  Pen{
    PilotPen pp=new PilotPen();

    @Override
    public  void  write(String str){
        pp.mark(str);
    }

}
public class AdapterDemo {
    public static void main(String[] args) {
    AssingmentWork aw=new AssingmentWork();
    Pen p=new PenAdaptor();
    PilotPen pp=new PilotPen();

    aw.setP(p);
    aw.writeAssignment("im tired");
    }
}
