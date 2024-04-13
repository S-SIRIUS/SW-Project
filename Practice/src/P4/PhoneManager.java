package P4;

import java.util.Scanner;
public class PhoneManager {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = scanner.nextInt();
        Phone p[] = new Phone[n];
        for(int i=0; i<n; i++){
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = scanner.next();
            String p_num = scanner.next();
            p[i] = new Phone(name, p_num);
        }
        while(true){
            System.out.print("검색할이름>>");
            String name = scanner.next();
            for(int i=0; i<n; i++){
                if(name.equals("exit")){
                    System.out.println("시스템을 종료합니다.");
                    System.exit(1);
                }
                if(p[i].getName().equals(name)){
                    System.out.println(p[i].getTel());
                    break;
                }
                if(i==n-1){
                    System.out.println(name+"은 없습니다.");
                }

            }

        }
    }
}
