package final_practice.NestedClass;

class o1{
    public static void method1(int a1){
        int A1 = a1;
        class c2{

            void method2(){
                System.out.println(A1);
            }
        }
        c2 testing = new c2();
        testing.method2();
    }
}
public class localvariable_Final {
    public static void main(String [] args){
        o1.method1(30);
    }
}
