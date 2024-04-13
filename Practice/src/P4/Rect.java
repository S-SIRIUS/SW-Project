package P4;
import java.util.Scanner;
public class Rect {
    private int width, height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea() {return width*height;}

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Rect r[] = new Rect[4];
        int sum=0;
        for(int i=0; i<4; i++){
            System.out.print("너비와 높이 >> ");
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            r[i] = new Rect(w, h);
            sum+=r[i].getArea();
        }
        System.out.println("사각형의 전체 합은,"+sum);
    }
}
