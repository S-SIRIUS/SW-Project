package P3;
import java.util.Scanner;
public class arrange {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        for(int i=0; i<10; i++){
            array[i] = scanner.nextInt();
        }
        int [] new_array = bubble(array);

        for(int i=0; i<10; i++){
            System.out.print(new_array[i]+" ");
        }
    }

    private static int[] bubble(int [] array){

        for(int i=1; i<array.length; i++){
            for(int j=0; j<i; j++){
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }

        return array;
    }
}
