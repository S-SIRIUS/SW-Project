package P3;

import java.util.Scanner;
public class three {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int[] int_array = new int[10];
        for(int i=0; i<10; i++){
            int_array[i] = scanner.nextInt();
        }
        for(int i=0; i<10; i++){
            if(int_array[i]%3==0) {
                System.out.print(int_array[i] + " ");
            }
        }

    }
}
