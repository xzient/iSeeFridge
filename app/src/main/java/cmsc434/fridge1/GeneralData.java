package cmsc434.fridge1;

import android.text.Spannable;
import android.view.View;

import java.sql.SQLClientInfoException;
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
    public HashMap users = new HashMap<String, String>(){{
        put("Steve", "green");
        put("Lauren", "orange");
        put("Anna", "purple");
    }};

    //Edit inventory
    int currentItemNumBeingEdited = 0;
    InventoryItem currentItemEditing;


    //Inventory Data

    String currentInventory = "";
    int currentInventoryLocation = 0;
    View currentView;

    InventoryItem eggs = new InventoryItem("Eggs", "Dozen", "Anna");
    InventoryItem milk = new InventoryItem("Milk", "1qt", "Lauren");
    InventoryItem ham = new InventoryItem("Ham", "0.5lb", "Lauren");
    InventoryItem chickenBreast = new InventoryItem("Chicken Breast", "1lb", "Anna");
    InventoryItem swissCheese = new InventoryItem("Swiss Cheese", "0.25lb", "Lauren");
    InventoryItem orangeJuice = new InventoryItem("Orange Juice", "1gal", "Steve");
    InventoryItem appleJuice = new InventoryItem("Apple Juice", "1gal", "Steve");
    InventoryItem turkey = new InventoryItem("Turkey", "0.5lb", "Lauren");
    InventoryItem carrots = new InventoryItem("Carrots", "0.5lb", "Steve");
    InventoryItem vegetableStock = new InventoryItem("Vegetable Stock", "1lt", "Anna");
    InventoryItem ketchup = new InventoryItem("Heinz Tomato Ketchup", "20oz", "Steve");

    ArrayList<InventoryItem> inventoryItems = new ArrayList<InventoryItem>(){{
        add(eggs);
        add(milk);
        add(ham);
        add(chickenBreast);
        add(swissCheese);
        add(orangeJuice);
        add(appleJuice);
        add(turkey);
        add(carrots);
        add(vegetableStock);
        add(ketchup);

    }};


    InventoryListAdapter inventoryListAdapter;
    //Users


    public static GeneralData getSingleInstance() {
        if (singleInstance == null)
            singleInstance = new GeneralData();

        return singleInstance;
    }

    //Delete/Edit Item from Inventory
    int currentInvItem = 0;
    String nameInvItem = "";
    String amountInvItem = "";
    String notesInvItem = "";


    /*
    public GeneralData() {
        //Data for users
        users.put("Steve", "green");
        users.put("Lauren", "orange");
        users.put("Anna", "purple");


        //General data for inventory
    }
    */


}