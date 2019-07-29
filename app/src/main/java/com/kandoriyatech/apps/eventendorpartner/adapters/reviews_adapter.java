package com.kandoriyatech.apps.eventendorpartner.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.kandoriyatech.apps.eventendorpartner.R;
import com.kandoriyatech.apps.eventendorpartner.model.Reviews;
import java.util.List;

public class reviews_adapter extends RecyclerView.Adapter<reviews_adapter.ViewHolder> {

    private List<Reviews> listItems;
    private Context context;


    public reviews_adapter(List<Reviews> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
        //this.onItemClickListener = item_listener;
    }

    @NonNull
    @Override
    public reviews_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.reviews_item_layout, viewGroup, false);

        return new reviews_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull reviews_adapter.ViewHolder viewHolder, int i) {



    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        public ViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }


}