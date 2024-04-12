package P3;
import java.util.Scanner;
public class samyukgu {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int three=0;
            int six=0;
            int nine=0;
            String temp = scanner.nextLine();
            int temp_temp = temp.length();
            for (int i=0; i<temp_temp; i++)
            {
                if (temp.contains("3")) {
                    int idx = temp.indexOf("3");
                    temp = temp.substring(0, idx) + temp.substring(idx+1);
                    three += 1;
                }
                if (temp.contains("6")) {
                    int idx = temp.indexOf("6");
                    temp = temp.substring(0, idx) + temp.substring(idx+1);
                    six += 1;
                }
                if (temp.contains("9")) {
                    int idx = temp.indexOf("9");
                    temp = temp.substring(0, idx) + temp.substring(idx+1);
                    nine += 1;
                }
            }
            System.out.println("박수 "+(three+six+nine)+"번입니다.");
        }
    }
}
