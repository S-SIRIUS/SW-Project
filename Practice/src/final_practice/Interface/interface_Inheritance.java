package final_practice.Interface;

interface Parents{
    void m1();
}
interface Childs extends Parents{
    void m2();
}

class imp implements Childs{
    @Override
    public void m1(){
        System.out.println("First fun");
    }
    @Override
    public void m2(){
        System.out.println("Second fun");
    }
}

public class interface_Inheritance {
    public static void main(String [] args){
        Childs a1 = new imp();
        a1.m2();
        a1.m1();
        Parents a2 = new imp();
        a2.m1();
    }
}
