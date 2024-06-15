package Interface;

interface A{
    void print_A();
}

class B implements A{
    @Override
    public void print_A(){
        System.out.println("B is implmentation of A");
    }
}

class C implements A{
    @Override
    public void print_A(){
        System.out.println("C is implmentation of A");
    }
}

class D extends B{
    public void print_unique(){
        System.out.println("UIQUE D PRINT");
    }
}

class E extends C{
    public void print_unique(){
        System.out.println("UIQUE E PRINT");
    }
}


public class Casting_Example {
    public static void main(String[] args){
        A a = null;
        a = new B();
        a.print_A();
        a = new C();
        a.print_A();
        a = new D();
        D d = (D)a;
        d.print_unique();
        a = new E();
        E e = (E)a;
        e.print_unique();
    }
}
