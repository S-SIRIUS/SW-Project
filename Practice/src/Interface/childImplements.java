package Interface;

interface test{
    int IAM_INT=10;
    default void print_Test(){
        System.out.println("I'm Test");
    }

    void printing();
}

class AAA implements test{
    @Override
    public void printing(){
        System.out.println("Print AAA");
    }
}

class BBB implements test{
    @Override
    public void printing(){
        System.out.println("Print BBB");
    }
}
class CCC extends AAA{
    @Override
    public void printing(){
        System.out.println("Print CCC");
    }
}

class DDD extends BBB{
    @Override
    public void printing(){
        System.out.println("Print DDD");
    }
}
public class childImplements {
    public static void main(String[] args){
        test t1 = new AAA();
        t1.printing();
        test t2 = new BBB();
        t2.printing();
        test t3 = new CCC();
        t3.printing();
        test t4 = new DDD();
        t4.printing();
    }
}
