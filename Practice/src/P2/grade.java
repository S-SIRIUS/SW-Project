package P2;

import java.util.Scanner;
public class grade {
    public static void main(String[]args){
        System.out.print("학점을 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        switch(a){
            case "A": case "B":
                System.out.print("Excellent");
                break;
            case "C": case "D":
                System.out.print("GOOD");
                break;
            case "F":
                System.out.print("BYE");
                break;
        }
    }
}
