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
import com.nian.project_uts.models.Computer;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AksesoriesAdapter extends RecyclerView.Adapter<AksesoriesAdapter.ViewHolder> {

    private Context context;
    private List<Computer> items;

    public AksesoriesAdapter(Context context, List<Computer> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_aksesoris, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Computer item = items.get(position);
    holder.namaTextAksesoris.setText(item.getNama());
        Picasso.get().load(item.getGambar()).into(holder.gambarImageAksesoris);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarImageAksesoris;
        TextView namaTextAksesoris;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarImageAksesoris=itemView.findViewById(R.id.logo_aksesoris);
            namaTextAksesoris=itemView.findViewById(R.id.text_nameaksesoris);
        }
    }
}
