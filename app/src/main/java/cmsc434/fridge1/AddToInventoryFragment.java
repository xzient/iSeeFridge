package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AddToInventoryFragment extends Fragment {

    GeneralData generalData = GeneralData.getSingleInstance();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_to_inventory, container, false);
        getActivity().setTitle(Html.fromHtml("<small>"+ getString(R.string.nav_add_to_inventory) +"</small>"));

        final TextView nameTV = view.findViewById(R.id.add_to_inventory_name);
        final TextView ownerTV = view.findViewById(R.id.add_to_inventory_owner);
        final TextView amountTV = view.findViewById(R.id.add_to_inventory_amount);

        BottomNavigationView bottomNav = view.findViewById(R.id.bottom_navigation_add_to_inventory);

        //Listener for bottom navigation bar
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            FragmentManager fm = getFragmentManager();
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_add_to_inventory_add:
                        generalData.inventoryItems.add( new InventoryItem(nameTV.getText().toString(), amountTV.getText().toString(), "For " + ownerTV.getText().toString()));
                        fm.popBackStack();

                        break;

                    case R.id.nav_add_to_inventory_cancel:
                        fm.popBackStack();
                        break;

                    case R.id.nav_add_to_inventory_add_from_inventory:

                        //TO DO

                        break;


                }
                return true;
            }
        });















        return view;
    }
}
