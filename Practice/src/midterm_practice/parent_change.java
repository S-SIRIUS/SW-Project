package midterm_practice;
class a1{
    int num;
    a1(){
        System.out.println("부모 기본생성자 호출");
    }
}

class b1 extends a1{
    b1(){
        //super()가 여기 있다.
        System.out.println("생성된 부모의 name"+super.num); //부모의 name과 같은 메모리 주소를 공유한다.
    }

}

public class parent_change {

    public static void main(String [] args){
        b1 test_c = new b1();

    }
}
