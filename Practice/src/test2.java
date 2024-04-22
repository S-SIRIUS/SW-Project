class AA{
    protected int field1=0;
    protected void method(){
        System.out.println("부모메소드");
    }
}
public class test2 extends AA{

    public void method(){
        System.out.println("자식으로 오버라이딩");
    }
    public void method2(){
        this.field1 = 10;
        super.method();
        this.method();
    }

    public static void main(String[] args){
        test2 t1 = new test2();
        t1.method2();
        System.out.print(t1.field1);
    }
}
