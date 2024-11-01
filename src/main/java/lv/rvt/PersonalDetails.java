package lv.rvt;

import java.util.*;

public class PersonalDetails
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        int YearsSum = 0;
        String longest = "";
        double count = 0;


        while (true) {
            String i = scanner.nextLine();
            if (i.equals("")) {
                break;
            }
            count = count + 1;

            String[] parts = i.split(",");

            if (parts[0].length() > longest.length()) {
                longest = parts[0];
            }
            YearsSum = YearsSum + Integer.valueOf(parts[1]);


        }
        System.out.println("Longest name: "+longest);
        System.out.println("Average of the birth years: "+YearsSum/count);
        
    }

}
