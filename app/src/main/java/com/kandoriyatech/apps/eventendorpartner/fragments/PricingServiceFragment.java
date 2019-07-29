package com.kandoriyatech.apps.eventendorpartner.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kandoriyatech.apps.eventendorpartner.R;
import com.kandoriyatech.apps.eventendorpartner.adapters.pricing_service_adapter;
import com.kandoriyatech.apps.eventendorpartner.model.pricing_service_item;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PricingServiceFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<pricing_service_item> list_items;


    public PricingServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pricing, container, false);

        recyclerView = view.findViewById(R.id.home_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list_items = new ArrayList<>();

        loadRecyclerViewData();


        return view;
    }

    private void loadRecyclerViewData() {


        try {

            for (int i = 0; i<50; i++) {
                pricing_service_item list_item = new pricing_service_item(
                        "Himanshu Patel", "details", "price");

                list_items.add(list_item);

            }

            adapter =  new pricing_service_adapter(list_items, getContext());

            recyclerView.setAdapter(adapter);

            recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),
                    DividerItemDecoration.VERTICAL));
            DividerItemDecoration itemDecorator = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
            itemDecorator.setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.divider));



        } catch (Exception e){
            e.printStackTrace();
        }



    }

}
