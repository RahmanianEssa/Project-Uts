package com.nian.project_uts.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nian.project_uts.AcerActivity;
import com.nian.project_uts.AsusActivity;
import com.nian.project_uts.DellActivity;
import com.nian.project_uts.HpActivity;
import com.nian.project_uts.models.Computer;
import com.squareup.picasso.Picasso;

import com.bumptech.glide.Glide;
import com.nian.project_uts.LaptopActivity;
import com.nian.project_uts.R;



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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
    final Computer item = items.get(position);
        holder.namaText.setText(item.getNama());
        Picasso.get().load(item.getGambar()).into(holder.gambarImage);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID().matches("1")){
                    Intent gotoactivity = new Intent(context, AcerActivity.class);
                    context.startActivity(gotoactivity);
                }else if(items.get(position).getRowID().matches("2")){
                    Intent gotoactivity = new Intent(context, AsusActivity.class);
                    context.startActivity(gotoactivity);
                }else if(items.get(position).getRowID().matches("3")){
                    Intent gotoactivity = new Intent(context, HpActivity.class);
                    context.startActivity(gotoactivity);
                }else if (items.get(position).getRowID().matches("4")){
                    Intent gotoactivity = new Intent(context, DellActivity.class);
                    context.startActivity(gotoactivity);
                }
            }
        });
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
