package lv.rvt;

import java.util.*;

public class RandomElements 
{
    public static void main( String[] args )
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in); 

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i = i + 1) {
            numbers[i] = random.nextInt(10) + 1;
            System.out.println(numbers[i]);
        }
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int i = 0; i<10; i = i + 1) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        for (int i = 0; i<10; i = i + 1) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i<10; i = i + 1) {
            sum = sum + numbers[i];
        }
        double average = sum/10;
        System.out.println("Minimāla vērtība: "+min);
        System.out.println("Maksimāla vērtība: "+max);
        System.out.println("Vidēja vērtība: "+average);
    }

}
