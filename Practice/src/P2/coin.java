package P2;

import java.util.Scanner;
public class coin {
    public static void main(String [] args){
        System.out.print("돈의 액수를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int oman = a/50000; //1
        int man =  a% 50000 / 10000;
        int man_b = a%50000 % 10000;
        int chun = man_b % 10000 / 1000;
        int chun_b = man_b % 10000 % 1000;
        int obak = chun_b % 1000 / 500;
        int obak_b = chun_b % 1000 % 500;
        int bak = obak_b % 500 / 100 ;
        int bak_b = obak_b%500 % 100;
        int sip = bak_b%100 / 10;
        int sip_b = bak_b % 100 % 100;
        int il = sip_b%10 / 1;

        System.out.printf("오만원 %d, 만원 %d, 천원 %d, 500원 %d, 100원 %d, 10원 %d, 1원 %d", oman, man, chun, obak, bak, sip, il);

    }
}
