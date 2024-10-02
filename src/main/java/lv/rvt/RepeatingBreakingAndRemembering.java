package lv.rvt;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;


        while (true) { 
            int UserInput = Integer.valueOf(scanner.nextLine());
            if (UserInput == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (UserInput % 2 == 0)  {
                sum = sum + UserInput;
                count = count + 1;
                even = even + 1;
                continue;
            } else if (UserInput % 2 != 0) {
                sum = sum + UserInput;
                count = count + 1;
                odd = odd + 1;
                continue;
            }
                


        }
        double average = (double)sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

}
