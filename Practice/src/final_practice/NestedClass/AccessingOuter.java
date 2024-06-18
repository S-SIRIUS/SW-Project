package final_practice.NestedClass;

class A{
    int a=10;

    void method1(){
        System.out.println("this is outer");
    }
    class B{
        void method2(){
            System.out.print("invoke outer: ");
            A.this.method1();
            System.out.println("this is inner");
        }
    }
}

public class AccessingOuter {
    public static void main(String[]args){
        A a = new A();
        A.B test = a.new B();
        test.method2();
    }
}
