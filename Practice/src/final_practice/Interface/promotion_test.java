package final_practice.Interface;
interface p_test{
    void method1();
}

class p1 implements p_test{
    @Override
    public void method1(){
        System.out.println("Hihi");
    }

    public void method2(){
        System.out.println("this is new");
    }
}

class p2 implements p_test{
    @Override
    public void method1(){
        System.out.println("Hihi");
    }

    public void method2(){
        System.out.println("this is new");
    }
}

class p3 extends p1{
    public void method3(){
        System.out.println("this is new3");
    }
}

class p4 extends p2{
    public void method4(){
        System.out.println("this is new4");
    }
}
public class promotion_test {
    public static void main(String [] args){
        p_test t1 = new p1();
        t1.method1();

        p_test t2 = new p2();
        t2.method1();

        p_test t3 = new p3();
        t3.method1();

        p_test t4 = new p4();
        t4.method1();
    }
}
