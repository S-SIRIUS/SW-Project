package P2;

import java.util.Scanner;
public class switch_test {
    public static void main(String [] args) {
        System.out.print("논리 연산자를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        String op = scanner.next();
        boolean b = scanner.nextBoolean();
        switch (op) {
            case "AND":
                System.out.print(a & b);
                break;
            case "OR":
                System.out.print(a | b);
                break;
        }
    }

}