package com.kandoriyatech.apps.eventendorpartner.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kandoriyatech.apps.eventendorpartner.R;
import com.kandoriyatech.apps.eventendorpartner.model.gallery_item;

import java.util.List;

public class gallery_adapter extends RecyclerView.Adapter<gallery_adapter.ViewHolder> {

    private List<gallery_item> listItems;
    private Context context;


    public gallery_adapter(List<gallery_item> gallery_items, Context context) {
        this.listItems = gallery_items;
        this.context = context;
    }


    @NonNull
    @Override
    public gallery_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.gallery_item, viewGroup, false);

        return new gallery_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull gallery_adapter.ViewHolder viewHolder, int i) {

        gallery_item listItem = listItems.get(i);


        //viewHolder.head.setText(listItem.getImageView());
        //viewHolder.desc.setText(listItem.getDesc() + "\n" + listItem.getImage_url());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView gallery_pic;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gallery_pic = itemView.findViewById(R.id.imageView);
        }
    }


}
