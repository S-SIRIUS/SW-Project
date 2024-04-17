package P5;
import java.util.Scanner;
class StackInterface{
    String [] stack = new String[5];
    public int length(){
        return stack.length;
    }
    public String pop(){
        for(int i=4; i>=0; i--){
            if(stack[i]!=null){
                String ans = stack[i];
                stack[i] = null;
                return ans;
            }
        }
        return null;
    }
    public boolean push(String st){
        for(int i=0; i<5; i++){
            if(stack[i]==null){
                stack[i] = st;
                return true;
            }
        }
        return false;
    }
}
public class StringStack extends StackInterface{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        String test = scanner.nextLine();
        String [] st = test.split(" ");
        StringStack stack = new StringStack();

        System.out.println(test);
        for(int i=0; i<5; i++)
        {
            stack.push(st[i]);
        }
        for(int i=0; i<5; i++)
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
