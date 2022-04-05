package com.example.realestateapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private Context context;
    private List<Property> propertyList;

    public PropertyAdapter(Context context, List<Property> propertyList) {
        this.context = context;
        this.propertyList = propertyList;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.property_row, parent, false);
        return new PropertyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        holder.propertyImageView.setImageResource(propertyList.get(position).getImage());
        holder.addressTextView.setText(propertyList.get(position).getAddress());
        holder.bedTextView.setText(propertyList.get(position).getBed());
        holder.bathTextView.setText(propertyList.get(position).getBath());
        holder.carTextView.setText(propertyList.get(position).getCar());
        holder.rentTextView.setText(propertyList.get(position).getRent());
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public class PropertyViewHolder extends RecyclerView.ViewHolder {
        ImageView propertyImageView;
        TextView addressTextView, bedTextView, bathTextView, carTextView, rentTextView;
        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);

            propertyImageView = itemView.findViewById(R.id.propertyImageView);
            addressTextView = itemView.findViewById(R.id.addressTextView);
            bedTextView = itemView.findViewById(R.id.bedroomTextView);
            bathTextView = itemView.findViewById(R.id.bathTextView);
            carTextView = itemView.findViewById(R.id.carTextView);
            rentTextView = itemView.findViewById(R.id.rentTextView);
        }
    }
}
