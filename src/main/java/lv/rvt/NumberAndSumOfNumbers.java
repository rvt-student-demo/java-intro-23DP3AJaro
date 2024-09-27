package lv.rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int sum = 0;
        int cycles = 0;

        while (true) {
            System.out.println("Give a number:");
            int UserInput = Integer.valueOf(scanner.nextLine());
            if (UserInput == 0) {
                break;
            } else {
                sum = sum + UserInput;
            }
            cycles = cycles + 1;


        }
        System.out.println("Number of numbers: " + cycles);
        System.out.println("Sum of the numbers: " + sum);

    }

}
