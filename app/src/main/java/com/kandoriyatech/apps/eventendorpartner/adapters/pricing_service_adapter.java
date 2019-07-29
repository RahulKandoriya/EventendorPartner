package com.kandoriyatech.apps.eventendorpartner.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kandoriyatech.apps.eventendorpartner.R;
import com.kandoriyatech.apps.eventendorpartner.model.pricing_service_item;
import java.util.List;

public class pricing_service_adapter extends RecyclerView.Adapter<pricing_service_adapter.ViewHolder> {

    private List<pricing_service_item> listItems;
    private Context context;


    public pricing_service_adapter(List<pricing_service_item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
        //this.onItemClickListener = item_listener;
    }

    @NonNull
    @Override
    public pricing_service_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.pricing_service_item, viewGroup, false);

        return new pricing_service_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pricing_service_adapter.ViewHolder viewHolder, int i) {



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