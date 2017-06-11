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
public class DoFragment extends Fragment {


    public DoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.venue_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        final ArrayList<Venue> venueList = new ArrayList<Venue>();
        venueList.add( new Venue("Watch the sunset","Porto Alegre has a beautiful sunset over its main river, Guaíba. Best enjoyed on the western side at places like Gasômetro and Ipanema.",R.drawable.por_do_sol) );
        venueList.add( new Venue("Catamaran to Guaiba","commuter ferry service connecting downtown and Barra Shopping Sul to the neighbour city Guaiba. Nice panoramic views of the city, best at sunrise and sunset.",R.drawable.catamaran) );
        venueList.add( new Venue("Feira do Livro","Every november, hundreds of publishing editors sell books on Praça da Alfândega. It's possible to find rare books and cheap prices.",R.drawable.feira_do_livro) );

        VenueAdapter adapter = new VenueAdapter(getContext(), venueList);

        listView.setAdapter(adapter);

        return rootView;
    }

}
