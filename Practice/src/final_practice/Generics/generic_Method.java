package final_practice.Generics;

class gm{
    public static <T> void print(T a){
        System.out.println(a);
    }
}
public class generic_Method {
    public static void main(String [] args){
        gm.print("10");
    }
}
