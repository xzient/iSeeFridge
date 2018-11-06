package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeFragment extends Fragment {

    String items[];
    //NavigationView navigationView = getActivity().findViewById(R.id.nav_view);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        getActivity().setTitle("Lauren");


        items = new String[] {
                getString(R.string.nav_notes), getString(R.string.nav_inventory),
                getString(R.string.nav_shopping_list), getString(R.string.nav_meals),
                getString(R.string.nav_users), getString(R.string.nav_add_to_inventory),
                getString(R.string.nav_user_parameters), getString(R.string.nav_settings)
        };



        ListView listView = view.findViewById(R.id.list_view_home);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                NavigationView navigationView = getActivity().findViewById(R.id.nav_view);
                switch (i) {
                    case 0: //Notes
                        fr.replace(R.id.fragment_container, new NotesFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_notes);
                        break;
                    case 1://Inventory
                        fr.replace(R.id.fragment_container, new InventoryFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_inventory);
                        break;
                    case 2://Shopping list
                        fr.replace(R.id.fragment_container, new ShoppingListFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_shopping_list);
                        break;
                    case 3://Meals
                        fr.replace(R.id.fragment_container, new MealsFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_meals);
                        break;
                    case 4://Users
                        fr.replace(R.id.fragment_container, new UsersFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_users);
                        break;
                    case 5://Add to inventory
                        fr.replace(R.id.fragment_container, new AddToInventoryFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_add_to_inventory);
                        break;
                    case 6://User parameters
                        fr.replace(R.id.fragment_container, new UserParametersFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_user_parameters);
                        break;
                    case 7://Settings
                        fr.replace(R.id.fragment_container, new SettingsFragment()).commit();
                        navigationView.setCheckedItem(R.id.nav_settings);
                        break;
                    default:
                        break;
                }
            }
        });

        return view;
    }
}
