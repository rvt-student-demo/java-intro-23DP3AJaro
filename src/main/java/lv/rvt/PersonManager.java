package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import lv.rvt.Helper;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String Line;
        reader.readLine();

        while((Line = reader.readLine()) != null){
            String[] parts = Line.split(", ");

            String name;
            int age;
            int weight;
            int height;
            String address;

            name = parts[0];
            age = Integer.valueOf(parts[1]);
            weight = Integer.valueOf(parts[2]);
            height = Integer.valueOf(parts[3]);
            address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }
        return personList;
    }
}
