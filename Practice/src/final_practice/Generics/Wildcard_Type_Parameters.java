package final_practice.Generics;
class Person{}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student{}
class MiddleStudent extends Student{}

class testing <T>{
    T field;
    testing(T a){
        this.field = a;
    }
}
class test{

    public static void methodt(testing <? extends Student> t){
        System.out.println(t.field);
    }
}

public class Wildcard_Type_Parameters {
    public static void main(String[] args){
        test.methodt(new testing<HighStudent>(new HighStudent()));

        // test.methodt(new testing<HighStudent>(new Worker())); //오류
    }
}
