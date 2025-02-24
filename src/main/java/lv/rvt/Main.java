package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) throws Exception {

        Person newPerson = new Person("Bennet", 27, 69, 185, "Los Angeles");

        PersonManager.addPerson(newPerson);
    }   
    
}