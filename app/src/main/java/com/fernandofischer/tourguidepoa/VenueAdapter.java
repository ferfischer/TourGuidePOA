package com.fernandofischer.tourguidepoa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
    public View getView(int position, final View convertView, ViewGroup parent) {

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

        /* Representative image */

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        if (currentVenue.hasImage()) {
            image.setImageResource(currentVenue.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        /* PHONE button */

        ImageView phoneButton = (ImageView) listItemView.findViewById(R.id.phone);

        if (currentVenue.getTelephone() != null && !currentVenue.getTelephone().isEmpty()){

            phoneButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:" + currentVenue.getTelephone()));

                            if (intent.resolveActivity(VenueAdapter.super.getContext().getPackageManager()) != null) {
                                VenueAdapter.super.getContext().startActivity(intent);
                            }

                        }
                    }
            );

        } else {
            phoneButton.setVisibility(View.GONE);
        }

        /* MAPS button */

        ImageView mapsButton = (ImageView) listItemView.findViewById(R.id.maps);

        if (currentVenue.getMapsURI() != null && !currentVenue.getMapsURI().isEmpty()){

            mapsButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(currentVenue.getMapsURI()));

                            if (intent.resolveActivity(VenueAdapter.super.getContext().getPackageManager()) != null) {
                                VenueAdapter.super.getContext().startActivity(intent);
                            }

                        }
                    }
            );

        } else {
            mapsButton.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

