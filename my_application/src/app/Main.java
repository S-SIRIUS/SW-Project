package app;
import pack1.A;
import pack2.C;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        C c = a.method();
        c.doSomething();
        }
    }
}