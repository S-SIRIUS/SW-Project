package final_practice.NestedClass;

class test{

    static final int a=10;
    static class test2{
        void method2() {
            test3.method1();
            System.out.println(a);
        }
    }

    class test3{
        static void method1(){
            System.out.println("hi");
        }
    }
}
public class NestedStatic {
    public static void main(String [] args){
        test a = new test();
        test.test2 b1 = new test.test2();
        b1.method2();
    }
}
