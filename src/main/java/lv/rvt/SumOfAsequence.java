package lv.rvt;

import java.util.Scanner;

public class SumOfAsequence 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int start = 1; start <= number; start = start + 1) {
            sum = sum + start;
        }

        System.out.println(sum);

    }

}
