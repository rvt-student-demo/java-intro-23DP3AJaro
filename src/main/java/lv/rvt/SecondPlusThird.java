package lv.rvt;

import java.util.*;

public class SecondPlusThird 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        ArrayList<Integer> List = new ArrayList<>();

        int a = 0;
        int num = 0;
        int sum = 0;
        while (1 > 0) {
           a = Integer.valueOf(scanner.nextLine());
           List.add(a);
           num = num + 1;
           if (a == 0) {
                break;
           }
        }
        System.out.println("List: ");
        for (int i = 0; i < num; i = i + 1) {
            System.out.println(List.get(i));
            sum = sum + List.get(i);
        }
        System.out.println("Summa ir " + sum);
        

    }

}
