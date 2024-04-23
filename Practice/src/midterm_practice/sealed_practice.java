package midterm_practice;

sealed class A2 permits B2, C2{

}

final class B2 extends A2{

}

final class C2 extends A2{

}
public class sealed_practice {
    public static void main(String[] args){
        C2 c = new C2();
    }
}
