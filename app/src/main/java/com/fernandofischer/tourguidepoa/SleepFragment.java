package com.fernandofischer.tourguidepoa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootView = inflater.inflate(R.layout.venue_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        final ArrayList<Venue> venueList = new ArrayList<Venue>();
        venueList.add( new Venue("Porto Alegre Eco Hostel","Eco Hostel offers excellent services and accommodations. Its located in Cidade Baixa, near to bars, restaurants, and all major tourist attractions.",R.drawable.porto_alegre_eco_hostel, "+55 51 30192449", "") );
        venueList.add( new Venue("Hotel Ritz","Quite a few students, and some others, living here permanently. Clean bedrooms. Internet, Wifi. Free use of kitchen.",R.drawable.hotel_ritz, "+55 51 32253423", "") );
        venueList.add( new Venue("Marechal Hotel","Very basic rooms but probably one of the cheapest options right in the middle of town. Singles from R$ 27.",R.drawable.marechal_hotel, "+55 51 30613076", "") );

        VenueAdapter adapter = new VenueAdapter(getContext(), venueList);

        listView.setAdapter(adapter);



        return rootView;

    }

}
