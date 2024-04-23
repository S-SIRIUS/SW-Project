package midterm_practice;

public class final_field {
    final int a;
    final_field(int a){
        this.a = a;
    }
    public static void main(String [] args){
        final_field test = new final_field(10);
        System.out.println(test.a);
    }
}
