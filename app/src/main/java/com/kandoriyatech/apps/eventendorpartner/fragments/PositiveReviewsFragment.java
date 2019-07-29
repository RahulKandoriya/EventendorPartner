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
import com.kandoriyatech.apps.eventendorpartner.adapters.gallery_adapter;
import com.kandoriyatech.apps.eventendorpartner.adapters.reviews_adapter;
import com.kandoriyatech.apps.eventendorpartner.model.Reviews;
import com.kandoriyatech.apps.eventendorpartner.model.gallery_item;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PositiveReviewsFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    List<Reviews> listItems;


    public PositiveReviewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_positive_reviews, container, false);


        recyclerView = view.findViewById(R.id.home_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        listItems = new ArrayList<>();

        loadRecyclerViewData();



        return view;
    }


    private void loadRecyclerViewData() {


        try {


            for (int i = 0; i<50; i++) {


                Reviews list_item = new Reviews("name", "review", "date");

                listItems.add(list_item);

            }

            adapter =  new reviews_adapter(listItems, getContext());

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
