package Interface;
interface default_Test{
    default void method1(){
        System.out.println("default");
    }
}

class Da implements default_Test{}
public class defaultMethod {
    public static void main(String[] args){
       Da d = new Da();
       d.method1();
    }
}
