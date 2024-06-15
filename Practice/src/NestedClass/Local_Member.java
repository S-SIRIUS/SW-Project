package NestedClass;
class P1{
    public void method1() {
        int arg=10;
        class P2 {
            void method1() {
                System.out.println(arg);
            }
        }
        P2 p2 = new P2();
        p2.method1();
    }
}

public class Local_Member {
    public static void main(String[] args){
        P1 p = new P1();
        p.method1();
    }
}
