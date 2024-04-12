package P2;
import java.util.Scanner;
public class sum_test{

    public static void main(String []args){
        System.out.print("두 정수를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+"+"+b+"은 " + sum_func(a,b));
    }
    private static int sum_func(int a, int b){
        return (a + b);
    }

}