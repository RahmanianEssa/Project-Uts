package com.nian.project_uts.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import com.bumptech.glide.Glide;
import com.nian.project_uts.LaptopActivity;
import com.nian.project_uts.R;
import com.nian.project_uts.model.Computer;


import org.w3c.dom.Text;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.ViewHolder> {

    private Context context;
    private List<Computer> items;

    public LaptopAdapter(Context context, List<Computer> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_laptop, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Computer item = items.get(position);
        holder.namaText.setText(item.getNama());
        Glide.with(context).load(item.getGambar()).into(holder.gambarImage);
    }


    @Override
    public int getItemCount() {

        return (items != null) ? items.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarImage;
        TextView namaText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

         gambarImage = itemView.findViewById(R.id.logo_laptop);
         namaText=itemView.findViewById(R.id.text_name);

        }
    }
}
