package final_practice;
class Box <T>{
    public T content;
}
public class generics {
    public static void main(String[] args){
        Box<String> box1 = new Box<>();
        box1.content = "hello world!";
        String str = box1.content;
        System.out.println(str);
    }
}
