package com.example.daur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder>{

    Context context;
    ArrayList<Barang> listBarang;
    public BarangAdapter(Context context, ArrayList<Barang> listBarang){
        this.context = context;
        this.listBarang = listBarang;
    }

    @NonNull
    @Override
    public BarangAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_barang,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BarangAdapter.ViewHolder holder, int position) {
        Barang barang = listBarang.get(position);
        holder.itemImage.setImageResource(barang.image);
        holder.itemTitle.setText(barang.title);
        holder.itemDescription.setText(barang.desc);
        holder.itemPrice.setText(barang.price);
    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDescription;
        TextView itemPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemDescription = itemView.findViewById(R.id.itemDescription);
            itemPrice = itemView.findViewById(R.id.itemPrice);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Barang barang = listBarang.get(getAdapterPosition());
            String info = barang.desc + "\n" + barang.price;
            Toast.makeText(context, info, Toast.LENGTH_LONG).show();
        }
    }
}
