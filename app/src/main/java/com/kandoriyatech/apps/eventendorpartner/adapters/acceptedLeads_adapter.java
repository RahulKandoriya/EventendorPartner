package com.kandoriyatech.apps.eventendorpartner.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kandoriyatech.apps.eventendorpartner.R;
import com.kandoriyatech.apps.eventendorpartner.model.leads_item;

import java.util.List;

public class acceptedLeads_adapter extends RecyclerView.Adapter<acceptedLeads_adapter.ViewHolder> {

    private List<leads_item> listItems;
    private Context context;


    public acceptedLeads_adapter(List<leads_item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
        //this.onItemClickListener = item_listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.accepted_item_layout, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        leads_item listItem = listItems.get(i);

        viewHolder.head.setText(listItem.getHead());
        viewHolder.desc.setText(listItem.getDesc() + "\n" + listItem.getImage_url());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView head, desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            head = (TextView) itemView.findViewById(R.id.text_heading);
            desc = (TextView) itemView.findViewById(R.id.text_desc);
        }
    }


}
