package lv.rvt;

import java.util.Scanner;

public class Counting 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int cycles = Integer.valueOf(scanner.nextLine());

        for (int start = 0; start <= cycles; start = start + 1) {
            System.out.println(start);
        }

    }

}
