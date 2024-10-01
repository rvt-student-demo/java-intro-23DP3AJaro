package lv.rvt;

import java.util.Scanner;

public class Counting 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int cycles = Integer.valueOf(scanner.nextLine());
        int start = 0;

        while (start <= cycles) {
            System.out.println(start);
            start = start + 1;
        }

    }

}
