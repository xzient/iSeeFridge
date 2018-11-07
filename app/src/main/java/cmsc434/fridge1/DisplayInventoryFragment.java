package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DisplayInventoryFragment extends Fragment {

    GeneralData generalData = GeneralData.getSingleInstance();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_display_inventory, container, false);
        getActivity().setTitle( getString(R.string.nav_inventory));

        TextView textView = view.findViewById(R.id.text_display_inventory);
        textView.setText(generalData.currentInventory);

        Button deleteButton = view.findViewById(R.id.delete_display_inventory);
        Button returnButton = view.findViewById(R.id.return_display_inventory);

        final FragmentManager fm = getFragmentManager();

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generalData.inventoryItems.remove(generalData.currentInventoryLocation);
                fm.popBackStack();
            }
        });

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.popBackStack();
            }
        });








        return view;
    }
}
