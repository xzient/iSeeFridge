package cmsc434.fridge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Singleton class that contains all the data for the program
 */
public class GeneralData {

    private static GeneralData singleInstance = null;
    ArrayList<String> notes = new ArrayList<String>(){
        {
            add("Steve added Heinz Tomato Ketchup to Home Inventory");
            add("Lauren added Milk to Home Inventory");
        }};


    ArrayList<String> alerts = new ArrayList<String>(){
        {
            add("Soy Milk will expire soon");
            add("Eggs will expire soon");
            add("You have not checked your inventory in 2 days");
        }};


    String currentNote = "";
    int currentNoteLocation = 0;
    int alertOrNote = 0; //Alert = 0; Note = 1;



    //Users by NAME and COLOR
    public HashMap users = new HashMap<String, String>();

    public static GeneralData getSingleInstance() {
        if (singleInstance == null)
            singleInstance = new GeneralData();

        return singleInstance;
    }



    public GeneralData() {
        users.put("Steve", "green");
        users.put("Lauren", "orange");
    }
}