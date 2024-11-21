package lv.rvt;

import java.util.ArrayList;

public class Book {
    private String Name;
    private int Pages;
    private int Year;

    public Book(String Name, int Pages, int Year) {
        this.Name = Name;
        this.Pages = Pages;
        this.Year = Year;
    }

    public String getName() {
        return Name;
    }

    public String toString() {
        return Name + ", " + Pages + " pages, " + Year;
    }
}
