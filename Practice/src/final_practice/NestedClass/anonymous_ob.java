package final_practice.NestedClass;

class P1{
    void printa(){}
}

interface i1{
    void printa();
}
public class anonymous_ob {
    public static void main(String [] args) {
        //상속
        P1 p = new P1() {
            void printa() {
                System.out.println("inheritance anonymous");
            }
        };
        p.printa();

        //인터페이스 구현
        i1 i = new i1(){
          public void printa(){
              System.out.println("interface anonymous");
          }
        };
        i.printa();
    }
}
