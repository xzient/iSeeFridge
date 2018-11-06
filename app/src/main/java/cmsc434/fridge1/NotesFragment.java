package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NotesFragment extends Fragment {

    GeneralData generalData = GeneralData.getSingleInstance();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        getActivity().setTitle("Notes");


        //TO DO

        ListView listView1 = view.findViewById(R.id.list_alert_notes);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, generalData.alerts);
        listView1.setAdapter(adapter1);


        ListView listView2 = view.findViewById(R.id.list_notes_notes);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, generalData.notes);
        listView2.setAdapter(adapter2);

        FloatingActionButton fab = view.findViewById(R.id.fab_notes);

        fab.setOnClickListener(new View.OnClickListener() {
            FragmentTransaction fr = getFragmentManager().beginTransaction();
            @Override
            public void onClick(View view) {
                fr.replace(R.id.fragment_container, new AddNoteFragment()).commit();

            }
        });




        return view;
    }
}
