package lv.rvt;

import java.util.Scanner;

public class SpeedingTicket 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Give speed:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number > 120) {
            System.out.println("Speeding ticket!");
        } else {
            System.out.println("No speeding ticket!");
        }

    }

}
