package final_practice.Interface;

interface include_d{

    int INT_CONSTANT = 10;
    void basic_abstract();
    default void method1(){
        System.out.println("hi im b");
    }
}

class include_dd implements include_d{
    @Override
    public void basic_abstract(){
        System.out.println(INT_CONSTANT);
        System.out.println("hello basic");
    }
}
public class default_test {
    public static void main(String[]args){
        include_d test = new include_dd();
        test.basic_abstract();
        test.method1();
    }
}
