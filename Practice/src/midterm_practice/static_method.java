package midterm_practice;


public class static_method {
    public static void main(String [] args){
        static_method test = new static_method();
        test.instance_method();
    }

    private void instance_method(){
        System.out.println("I'm instance Method");
    }
}
