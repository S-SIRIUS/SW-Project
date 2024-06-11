package final_practice;
interface InterfaceA{ void methodA();}
interface InterfaceB{ void methodB();}
interface InterfaceC extends InterfaceA, InterfaceB{void methodC();}

class InterfaceCImp1 implements InterfaceC{
    public void methodA(){
        System.out.println("method A");
    }
    public void methodB(){
        System.out.println("method B");
    }
    public void methodC(){
        System.out.println("method C");
    }

}
public class extend_Interface {
    public static void main(String[] args){
        InterfaceA ia = new InterfaceCImp1();
        ia.methodA();

        InterfaceB ib = new InterfaceCImp1();
        ib.methodB();

        InterfaceC ic = new InterfaceCImp1();
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
