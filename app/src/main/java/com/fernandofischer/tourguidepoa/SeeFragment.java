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
public class SeeFragment extends Fragment {


    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.venue_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        final ArrayList<Venue> venueList = new ArrayList<Venue>();
        venueList.add( new Venue("Monumento aos Açorianos","It is a 17m high momument in the memory of the people from the island of Azores, who were the first to settle in Porto Alegre.",R.drawable.monumento_acorianos,"","https://www.google.com.br/maps/place/Monumento+aos+A%C3%A7orianos/@-30.0390301,-51.231747,17z/data=!3m1!4b1!4m5!3m4!1s0x95197902fdc965fd:0xa4cb48c7d241d4be!8m2!3d-30.0390301!4d-51.229553") );
        venueList.add( new Venue("Santuário Mãe de Deus","A beautiful church almost unknown by most porto-alegrenses. It is placed in an great location, with nice views of Porto Alegre.",R.drawable.santuario_mae_deus,"","https://www.google.com.br/maps/place/Santu%C3%A1rio+Nossa+Senhora+M%C3%A3e+de+Deus/@-30.0998549,-51.1839293,17z/data=!3m1!4b1!4m5!3m4!1s0x95199d2ca86b0daf:0x4de369212932fe6a!8m2!3d-30.0998549!4d-51.1817353") );
        venueList.add( new Venue("Usina do Gasômetro","Is an old powerplant built in 1928 which was refurnished recently and now hosts movie theaters and art expositions.",R.drawable.usina_gazometro,"","https://www.google.com.br/maps/place/Centro+Cultural+Usina+do+Gas%C3%B4metro/@-30.0340404,-51.2432384,17z/data=!3m1!4b1!4m5!3m4!1s0x95197916eb04dc4d:0x3256b59744f76ead!8m2!3d-30.0340404!4d-51.2410444") );

        VenueAdapter adapter = new VenueAdapter(getContext(), venueList);

        listView.setAdapter(adapter);

        return rootView;
    }

}
