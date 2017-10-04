package com.example.android.bulawayo_city_guide_app;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link InfoAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Info} objects.
 */

public class InfoAdapter extends ArrayAdapter<Info> {
    /**
     * Create a new {@link InfoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param information is the list of {@link Info} to be displayed.
     */
    public InfoAdapter(Context context, ArrayList<Info> information) {
        super(context, 0, information);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Info} object located at this position in the list
        Info currentInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the Title from the currentInfo object and set this text on
        // the Title TextView.
        titleTextView.setText(currentInfo.getTitle());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the Description from the currentInfo object and set this text on
        // the Description TextView.
        descriptionTextView.setText(currentInfo.getDescription());

        // Find the TextView in the list_item.xml layout with the ID operating_hours_text_view.
        TextView operatingHoursTextView = (TextView) listItemView.findViewById(R.id.operating_hours_text_view);
        // Get the OperatingHours from the currentInfo object and set this text on
        // the OperatingHours TextView.
        operatingHoursTextView.setText(currentInfo.getOperatingHours());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the Title from the currentInfo object and set this text on
        // the Title TextView.
        addressTextView.setText(currentInfo.getAddress());

        // Return the whole list item layout (containing 4 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
