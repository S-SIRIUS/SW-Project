package P2;

import java.util.Scanner;
public class height {

    public static void main(String[]args){
        System.out.print("몇 층인지 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        System.out.println(floor*5 + "m 입니다.");
    }
}
