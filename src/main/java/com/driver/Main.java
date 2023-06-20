package com.driver;

public class Main {
    public static void main(String[] args){
        B obj = new B();
        String val =obj.meth();
        System.out.println(val);
    }

}
class A{
    String meth(){
        return "Inside class A";
    }
}
class B extends A{

}