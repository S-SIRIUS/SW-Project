package P3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class weeks {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] week = {"일", "월", "화", "수", "목", "금", "토"};

        while(true)
        {
            try {
                System.out.print("정수를 입력하세요>>");
                int num = scanner.nextInt();
                if(num==-1)
                {
                    break;
                }
                int week_day = num % 7;
                System.out.println("입력받은 날짜는" + week[week_day] + "입니다.");
            }
            catch(InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                scanner.next();
            }
        }
    }
}
