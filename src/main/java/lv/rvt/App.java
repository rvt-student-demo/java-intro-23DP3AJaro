package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ievadit vardu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet uzvardu: ");
        String surname = scanner.nextLine();

        System.out.println("Ievadiet grupu: ");
        String group = scanner.nextLine();


        System.out.println("Students: " + " " + name  + " " +  surname  + " " +  group);

    }

}
