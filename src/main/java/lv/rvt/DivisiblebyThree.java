package lv.rvt;

import java.util.Scanner;

public class DivisiblebyThree 
{
    public static void main( String[] args )
    {
        divisibleByThreeInRange(2, 10);
        

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i<=end; i = i + 1) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        }
}

