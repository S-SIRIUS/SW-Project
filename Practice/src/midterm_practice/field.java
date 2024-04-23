package midterm_practice;

public class field {


    void field_print() // 메소드가 먼저 나와도 됨
    {
        System.out.println("field의 메소드");
    }
    field(){} //생성자가 먼저 나와도 됨



    int f1;
    int f2;
    field(int f1){
        this.f1=f1;
    }
    field(int f1, int f2){ // this로 생성자 호출도 가능함
        this(f1);
        this.f2 = f2;
    }

    public static void main(String [] args){
        field test = new field();
        field test2 = new field(10, 20);
        System.out.println(test.f1); // 자동으로 0으로 초기화함
        System.out.println(test2.f1 + ","+ test2.f2); // 입력한 10과 20이 들어감
        test.field_print();
    }
}
