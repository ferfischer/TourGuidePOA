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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.venue_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        final ArrayList<Venue> venueList = new ArrayList<Venue>();
        venueList.add( new Venue("Lancheria do Parque","Has possibly the best cheap eats in Porto Alegre. Lunch is a very good buffet where the offerings are always fresh and tasty.",R.drawable.lancheria_do_parque,"+55 51 33118321","https://www.google.com.br/maps/place/Lancheria+do+Parque/@-30.0351685,-51.2138618,17z/data=!3m1!4b1!4m5!3m4!1s0x95197852b322c2ab:0x51312e5d5632d0b1!8m2!3d-30.0351685!4d-51.2116678") );
        venueList.add( new Venue("Churrascaria Giovanaz","An inexpensive churrascaria in the Cidade Baixa. You can eat as much meat (and side dishes) as you like for less than R$ 25 (US$ 12.70).",R.drawable.churrascaria_giovanaz,"+55 51 32274217","https://www.google.com.br/maps/place/Churrascaria+Giovanaz/@-30.0429464,-51.2218682,17z/data=!3m1!4b1!4m5!3m4!1s0x9519785675d8f51f:0xb3b8d6f5e9ec0105!8m2!3d-30.0429464!4d-51.2196742") );
        venueList.add( new Venue("Churrascaria Galpão Crioulo","Excellent gaucho barbecue, served using the traditional gaucho way with skewers. You can taste more than 20 different meat cuts.",R.drawable.churrascaria_galpao_crioulo,"+55 51 32268194","https://www.google.com.br/maps/place/Churrascaria+Galp%C3%A3o+Crioulo/@-30.0401604,-51.2398883,17z/data=!3m1!4b1!4m5!3m4!1s0x9519791b59186949:0xadb0cd36079efd47!8m2!3d-30.0401604!4d-51.2376943") );

        VenueAdapter adapter = new VenueAdapter(getContext(), venueList);

        listView.setAdapter(adapter);

        return rootView;
    }

}
