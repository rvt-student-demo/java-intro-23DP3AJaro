package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("Enter numbers: ");
        while (true) {
            int UserInput = scanner.nextInt();
            if (UserInput == -1) {
                break;
            } else if (UserInput % 2 == 0) {
                even = even + UserInput;
                statistics.addNumber(UserInput);
            } else if (UserInput % 2 != 0) {
                odd = odd + UserInput;
                statistics.addNumber(UserInput);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
    }

}
