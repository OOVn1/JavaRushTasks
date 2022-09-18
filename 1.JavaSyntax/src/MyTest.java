import java.util.Random;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] ars) {
   /*     int j = 0;
        int sum = 0;
       while (j < 15) {
           System.out.print(j + " ");
//            sum = sum + j;
//            j++;
//
//        }
//        System.out.println();
//        System.out.println(sum);

        for (int i = 0; i < 15; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);*/

        Random random = new Random();
        int[] array = new int[15];
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-100, 100);
            System.out.print(array[i] + " ");
            if(array[i] > 0 && array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("\n" + sum);

    }
}

