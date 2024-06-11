package final_practice;
class ClassName<E>{
    private E element;
    void setElement(E element){
        this.element = element;
    }
    E get(){
        return element;
    }

    public <E> E genericMethod1(E o){
        return o;
    }
    public <T> T genericMethod2(T o){
        return o;
    }
}
public class generic_Methods {
    public static void main(String[] args){
        ClassName<String> a = new ClassName<>();
        ClassName<Integer> b = new ClassName<>();

        a.setElement("10");
        b.setElement(10);

        System.out.println(a.get().getClass().getName());
        System.out.println(b.get().getClass().getName());
        System.out.println(a.genericMethod1(10).getClass().getName());
        System.out.println(b.genericMethod1("10").getClass().getName());
    }
}
