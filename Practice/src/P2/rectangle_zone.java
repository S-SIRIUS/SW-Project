package P2;
import java.util.Scanner;
public class rectangle_zone {
    public static void main(String []args){
        System.out.print("점 (x,y)의 좌표를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 50 & x<100){
            if(y > 50 & y<100){
                System.out.print("사이에 있습니다");
            }
        }
    }
}
