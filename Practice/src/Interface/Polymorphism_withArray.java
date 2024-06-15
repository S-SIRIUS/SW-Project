package Interface;

interface self{
    void print_self();
}

class B_self implements self{
    @Override
    public void print_self(){System.out.println("B");}
}
class C_self implements self{
    @Override
    public void print_self(){System.out.println("C");}
}

public class Polymorphism_withArray {
    public static void main(String[] args){
        self[] a = new self[2];
        a[0] = new B_self();
        a[0].print_self();
        a[1] = new C_self();
        a[1].print_self();
    }
}
