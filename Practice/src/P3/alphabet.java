package P3;
import java.util.Scanner;
public class alphabet {
    public static void main(String[] args){
        System.out.print("알파벳 한 문자을 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char end = a.charAt(0);
        for(char i='a'; i<=end; i++)
        {
            for(int j=i; j<=end; j++ ) {
                System.out.printf("%c", j);
            }
            System.out.print("\n");
        }
    }
}
