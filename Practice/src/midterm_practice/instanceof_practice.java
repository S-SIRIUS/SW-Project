package midterm_practice;

class p1{

}

class c1 extends p1{

}

public class instanceof_practice {
    public static void main(String [] args){
        c1 child1 = new c1();
        p1 parent1 = new p1();

        if(child1 instanceof c1){
            System.out.println("child1은 c1에 속한다.");
        }
        if(parent1 instanceof c1){
            System.out.println("parent1은 c1에 속한다.");
        }
    }
}
