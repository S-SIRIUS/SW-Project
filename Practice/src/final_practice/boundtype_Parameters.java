package final_practice;

public class boundtype_Parameters {
    public <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return (v1==v2);
    }
    public static void main(String[] args){
        boundtype_Parameters a = new boundtype_Parameters();
        System.out.println(a.compare(10, 20));
    }
}
