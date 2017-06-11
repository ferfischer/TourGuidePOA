package com.fernandofischer.tourguidepoa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fernandofischer on 11/06/17.
 */

public class VenueAdapter extends ArrayAdapter<Venue> {

    public VenueAdapter(Context context, List objects) {
        super(context, 0, objects);

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Venue currentVenue = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText( currentVenue.getTitle() );

        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText( currentVenue.getDescription() );

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (currentVenue.hasImage()) {
            image.setImageResource(currentVenue.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

