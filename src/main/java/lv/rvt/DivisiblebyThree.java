package lv.rvt;

import java.util.Scanner;

public class DivisiblebyThree 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(a, b);
        

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i<=end; i = i + 1) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        }
}

