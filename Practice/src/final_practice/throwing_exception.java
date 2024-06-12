package final_practice;

public class throwing_exception {
    public static void main(String[] args){
        try{
            findClass();
        }
        catch(ClassNotFoundException e){
            System.out.println("Exception"+e.getMessage());
        }
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang,String2");
    }
}
