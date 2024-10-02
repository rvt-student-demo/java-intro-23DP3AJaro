package lv.rvt;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Give numbers:");
        int sum = 0;


        while (true) { 
            int UserInput = Integer.valueOf(scanner.nextLine());
            if (UserInput == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum = sum + UserInput;
                continue;
            }
                


        }
        System.out.println("Sum: " + sum);
    }

}
