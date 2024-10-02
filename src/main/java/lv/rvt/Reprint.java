package lv.rvt;

import java.util.Scanner;

public class Reprint 
{
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); 

    System.out.println("Give number: ");

    int count = 0;
    int number = Integer.valueOf(scanner.nextLine());    // ask the user for the number of times that the phrase will be printed
        while (count < number) {
            printText();
            count = count + 1;
        }// use the while command to call the method a suitable number of times
    }
    
    public static void printText() {
        System.out.println("Hello world!");// write some code in here
    }

}
