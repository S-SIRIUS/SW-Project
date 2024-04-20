class A{
    public void method1(){
        System.out.println("A");
    }
}
class B extends A{
    public void method1() {
        System.out.println("B");
    }
}
class C extends A{
    public void method1() {
        System.out.println("C-m1");    }
    public void method2(){System.out.println("C-m2");}
}
public class Example {
    public static void action(A a){
        a.method1();
        if(a instanceof C c){
            c.method2();
        }
    }

    public static void main(String [] args){
     action(new A());
     action(new B());
     action(new C());
    }
}
