package com.example.itachi.com.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SNACK extends Fragment {


    public SNACK() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_snack, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.listrecyclerview4);

        ListAdaptor listadaptor = new ListAdaptor();
        recyclerView.setAdapter(listadaptor);
        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutmanager);

        return view;
    }

}
