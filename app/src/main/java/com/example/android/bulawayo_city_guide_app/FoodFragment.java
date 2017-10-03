package com.example.android.bulawayo_city_guide_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        // Create a list of information
        ArrayList<Info> information = new ArrayList<>();

        // Populate the adapter
        information.add(new Info("26 On Park", "Nice place to eat", "26 Park Rd, Suburbs", "8am - 5pm", 4.5));

        // Create an {@link InfoAdapter}, whose data source is a list of {@link information} (above). The
        // adapter knows how to create list items for each item in the list.
        InfoAdapter adapter = new InfoAdapter(getActivity(), information);

        /*ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);*/

        return rootView;

    }
}
