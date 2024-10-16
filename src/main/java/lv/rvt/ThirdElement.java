package lv.rvt;

import java.util.*;

public class ThirdElement 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in); 

        ArrayList<String> wordList = new ArrayList<>();

        String a = "";
        while (1 > 0) {
           a = scanner.nextLine();
           wordList.add(a);
           if (a == "") {
                break;
           }
        }
        System.out.println(wordList.get(2));
        

    }

}
