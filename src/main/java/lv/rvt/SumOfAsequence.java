package lv.rvt;

import java.util.Scanner;

public class SumOfAsequence 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int number = Integer.valueOf(scanner.nextLine());
        int start = 1;
        int sum = 0;

        while (start <= number) {
            sum = sum + start;
            start = start + 1;
        }

        System.out.println(sum);

    }

}
