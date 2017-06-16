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
        venueList.add( new Venue("Watch the sunset","Porto Alegre has a beautiful sunset over its main river, Guaíba. Best enjoyed on the western side at places like Gasômetro and Ipanema.",R.drawable.por_do_sol,"","https://www.google.com.br/maps/place/Centro+Cultural+Usina+do+Gas%C3%B4metro/@-30.0340404,-51.2432384,17z/data=!3m1!4b1!4m5!3m4!1s0x95197916eb04dc4d:0x3256b59744f76ead!8m2!3d-30.0340404!4d-51.2410444") );
        venueList.add( new Venue("Catamaran to Guaiba","Commuter ferry service connecting downtown and Barra Shopping Sul to the neighbour city Guaiba. Nice panoramic views of the city.",R.drawable.catamaran,"+55 51 40202022","https://www.google.com.br/maps/place/Terminal+Hidrovi%C3%A1rio+de+Porto+Alegre/@-30.0256024,-51.2303987,17z/data=!3m1!4b1!4m5!3m4!1s0x9519790c230c02ef:0x1b1886c78976189f!8m2!3d-30.0256024!4d-51.2282047") );
        venueList.add( new Venue("Feira do Livro","Every november, hundreds of publishing editors sell books on Praça da Alfândega. It's possible to find rare books and cheap prices.",R.drawable.feira_do_livro,"","https://www.google.com.br/maps/place/Feira+do+Livro+de+Porto+Alegre/@-30.0340401,-51.2498313,15z/data=!4m8!1m2!2m1!1sfeira+do+livro!3m4!1s0x0:0x610c98a36da1ec29!8m2!3d-30.029899!4d-51.2308842") );

        VenueAdapter adapter = new VenueAdapter(getContext(), venueList);

        listView.setAdapter(adapter);

        return rootView;
    }

}
