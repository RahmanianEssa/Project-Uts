package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class AsusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);

        RecyclerView asusView = findViewById(R.id.rv_asus);

        List<Produk> asus = new ArrayList<>();

        asus.add(new Produk(R.drawable.asus1, "Asus X441UV", "Cpu: Intel Core i3, Ram: 4Gb", "Rp.5.977.000"));
        asus.add(new Produk(R.drawable.asus2, "Asus VivoBook Max X441SA", "Cpu: Intel Celeron, Ram: 2Gb", "Rp.3.557.000"));
        asus.add(new Produk(R.drawable.asus3, "Asus VivoBook X540YA-BX421D", "Cpu: Amd E2, Ram: 4Gb", "Rp.3.595.000"));
        asus.add(new Produk(R.drawable.asus4, "Asus Vivobook Flip 12 TP203NAH", "Cpu: Intel Celeron, Ram: 4Gb", "Rp. 4.739.000"));
        asus.add(new Produk(R.drawable.asus5, "Asus TUF FX504GD", "Cpu: Intel Core i7, Ram: 8Gb", "Rp. 13.737.000"));
        asus.add(new Produk(R.drawable.asus6, "Asus Transformer Book T101HA-GR013T", "Cpu: Intel Atom x5, Ram: 2Gb", "Rp. 4.290.000"));
        asus.add(new Produk(R.drawable.asus7, "Asus Zenbook Flip UX461UN", "Cpu: Intel Core i7, Ram: 16Gb", "Rp. 17.690.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, asus);
        asusView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        asusView.setLayoutManager(layoutManager);

    }
}
