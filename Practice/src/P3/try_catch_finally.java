package P3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class try_catch_finally {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        try {
            int num = scanner.nextInt();
            int ans = num % 2;
            if(ans==1){
                System.out.println("홀수");
            }
            else{
                System.out.println("짝수");
            }
        }
        catch(InputMismatchException e){
            System.out.println("나눌수 없습니다.");
        }
        finally{
            scanner.close();
        }
    }
}
