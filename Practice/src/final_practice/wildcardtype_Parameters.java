package final_practice;

class Person{}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student{}
class MiddleStudent extends Student{}

class Applicant<T>{
    public T kind;
    public Applicant(T kind){
        this.kind = kind;
    }
}

class Course{
    public static void registerCourse1(Applicant <?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
    public static void registerCourse2(Applicant <? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }

    public static void registerCourse3(Applicant <? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
}
public class wildcardtype_Parameters {
    public static void main(String[] args){
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println("---------------------------");
        Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Person>(new Person()));
        System.out.println("---------------------------");
        Course.registerCourse3(new Applicant<Student>(new Student()));
        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
