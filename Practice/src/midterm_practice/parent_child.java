package midterm_practice;

class a{
    String name;
    a(){
        System.out.println("부모 기본생성자 호출");
    }
}

class b extends a{
    b(String name){
        //super()가 여기 있다.
        this.name = name;
    }
}

public class parent_child {

    public static void main(String [] args) {
        b test = new b("송송송");
        System.out.println(test.name);
    }
}
