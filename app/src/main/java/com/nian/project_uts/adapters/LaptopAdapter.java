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

import com.bumptech.glide.Glide;
import com.nian.project_uts.R;
import com.nian.project_uts.model.Computer;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.ViewHolder> {
    private static final int LOGO_GREY =2;
    private static final int LOGO_WHITE=1;
    private Context context;
    private List<Computer> items;

    public LaptopAdapter(Context context, List<Computer> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=null;
        if (LOGO_GREY==viewType){
            view= LayoutInflater.from(context)
                    .inflate(R.layout.item_laptop, parent, false);
            view.setBackgroundColor(Color.rgb(227, 221, 200));
        } else if (viewType==LOGO_WHITE){
            view=LayoutInflater.from(context)
                    .inflate(R.layout.item_laptop, parent , false);
        }
        return new LaptopAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopAdapter.ViewHolder holder, int position) {
    Computer item = items.get(position);
        Glide.with(context).load(item.getGambar()).into(holder.gambarImage);
        holder.namaText.setText(item.getNama());
        holder.deskribText.setText(item.getDeskripsi());
        holder.hargaText.setText(item.getHarga());
    }

    @Override

    public long getItemId(int position) {
        return (position % 4 == 3 || position % 4 == 0) ? LOGO_GREY : LOGO_WHITE;
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 4 == 3 || position % 4 == 0) ? LOGO_GREY : LOGO_WHITE;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarImage;
        TextView namaText;
        TextView deskribText;
        TextView hargaText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         gambarImage = itemView.findViewById(R.id.logo_laptop);
         namaText=itemView.findViewById(R.id.text_name);
         deskribText=itemView.findViewById(R.id.text_deskripsi);
         hargaText=itemView.findViewById(R.id.harga);
        }
    }
}
