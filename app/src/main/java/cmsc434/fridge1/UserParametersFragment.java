package cmsc434.fridge1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UserParametersFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_parameters, container, false);
        getActivity().setTitle(Html.fromHtml("<small>"+ getString(R.string.nav_user_parameters) +"</small>"));


        //TO DO



        return view;
    }
}
