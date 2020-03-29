package com.nian.project_uts.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nian.project_uts.R;
import com.nian.project_uts.models.Produk;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductLaptopAdapter extends RecyclerView.Adapter<ProductLaptopAdapter.ViewHolder> {
   private Context context;
   private List<Produk> items;

    public ProductLaptopAdapter(Context context, List<Produk> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Produk item = items.get(position);
            holder.tipeText.setText(item.getTipe());
            holder.detailText.setText(item.getDetail());
            holder.hargaText.setText(item.getHarga());
        Picasso.get().load(item.getGambar()).into(holder.gambar);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0 ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView tipeText;
        TextView detailText;
        TextView hargaText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            tipeText=itemView.findViewById(R.id.tipe);
            detailText=itemView.findViewById(R.id.detail);
            hargaText=itemView.findViewById(R.id.harga);
        }
    }
}
