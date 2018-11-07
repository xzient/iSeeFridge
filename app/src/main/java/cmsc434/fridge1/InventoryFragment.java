package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InventoryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inventory, container, false);
        getActivity().setTitle( getString(R.string.nav_inventory));

        //TO DO
        ListView listView = (ListView) view.findViewById(R.id.inventoryList);

        InventoryItem eggs = new InventoryItem("Eggs", "Dozen", "For Matt");
        InventoryItem milk = new InventoryItem("Milk", "1qt", "For Matt");
        InventoryItem ham = new InventoryItem("Ham", "0.5lb", "For Matt");
        InventoryItem chickenBreast = new InventoryItem("Chicken Breast", "1lb", "For Matt");
        InventoryItem swissCheese = new InventoryItem("Swiss Cheese", "0.25lb", "For Matt");
        InventoryItem orangeJuice = new InventoryItem("Orange Juice", "1gal", "For Matt");
        InventoryItem appleJuice = new InventoryItem("Apple Juice", "1gal", "For Matt");
        InventoryItem turkey = new InventoryItem("Turkey", "0.5lb", "For Matt");
        InventoryItem carrots = new InventoryItem("Carrots", "0.5lb", "For Matt");

        ArrayList<InventoryItem> inventoryItems = new ArrayList<>();

        inventoryItems.add(eggs);
        inventoryItems.add(milk);
        inventoryItems.add(ham);
        inventoryItems.add(chickenBreast);
        inventoryItems.add(swissCheese);
        inventoryItems.add(orangeJuice);
        inventoryItems.add(appleJuice);
        inventoryItems.add(turkey);
        inventoryItems.add(carrots);

        InventoryListAdapter adapter = new InventoryListAdapter(getActivity(), R.layout.inventory_adapter_view_layout, inventoryItems);
        listView.setAdapter(adapter);

        return view;
    }
}
