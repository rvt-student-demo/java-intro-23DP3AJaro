package lv.rvt;

import java.util.*;

public class OnlyTheseNumbers
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        ArrayList<Integer> Integers = new ArrayList<>();

        while (true) {
            Integer a = Integer.valueOf(scanner.nextLine());
            if (a.equals(-1)) {
                Integers.add(a);
                break;
            } 
                Integers.add(a);
            
        }
        for (int i = 0; i < Integers.size(); i = i + 1) {
            System.out.println(Integers.get(i));
        }
        System.out.print("From where? ");
        Integer b = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        Integer c = Integer.valueOf(scanner.nextLine());

        for (int i = b; i <= c; i = i+1) {
            System.out.println(Integers.get(i));
        }
    }

}
