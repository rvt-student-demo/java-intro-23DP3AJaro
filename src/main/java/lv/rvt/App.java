package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> Names = new ArrayList<>();
        ArrayList<Integer> PagesList = new ArrayList<>();
        ArrayList<Integer> Years = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                Names.add(title);

                System.out.print("Pages: ");
                int Pages = scanner.nextInt();
                PagesList.add(Pages);
                scanner.nextLine();

                System.out.print("Publication year: ");
                int Year = scanner.nextInt();
                Years.add(Year);
                scanner.nextLine();
            }
        }

        System.out.println();

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();
        if (choice.equals("everything")) {
            for (int i = 0; i < Names.size(); i = i + 1) {
                System.out.println(Names.get(i) + ", " + PagesList.get(i) + "pages, " + Years.get(i));
            }
        } else if (choice.equals("name")) {
            for (int i = 0; i < Names.size(); i = i + 1) {
                System.out.println(Names.get(i));
            }
        }

    }

}