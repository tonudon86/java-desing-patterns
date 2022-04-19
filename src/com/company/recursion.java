package com.company;

public class recursion {
    static int fac(int a){
        if(a==0|| a==1){
            a=1;
        }
        else {
            a=a+fac(a-1);
        }
        return a;
    }
    public static void main(String[] args) {
//        printing febonaci
        int res=fac(4);
        System.out.print(res);
    }
}
