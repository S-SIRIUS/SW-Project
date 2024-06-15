package NestedClass;

class A1{
    class B1{}
    B1 field = new B1();
    A1(){
        B1 b = new B1();
    }
    void method(){
        B1 b = new B1();
    }
}
public class Base {
    public static void main(String[] args){
        A1 a = new A1();
        A1.B1 b = a.new B1();
    }
}
