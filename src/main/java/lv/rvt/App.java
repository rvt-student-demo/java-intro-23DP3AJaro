package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String Name = scanner.nextLine();
            if (Name.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int Pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Publication year: ");
            int Year = scanner.nextInt();
            scanner.nextLine();

            books.add(new Book(Name, Pages, Year));
        }

        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
                for (Book book : books) {
                    System.out.println(book.getName());
                }
            }
        }
}

