package final_practice.Generics;

class P1{

    void methodP(){
        System.out.println("this is P1");
    }
}

class P2 extends P1{
}
class G1{}

class bd{
    public <T extends P1> void method1(T a){
        a.methodP();
    }
}
public class Bounded_Type_Parameters {
    public static void main(String[] args){
        bd test = new bd();
        test.method1(new P2());
    }
}
