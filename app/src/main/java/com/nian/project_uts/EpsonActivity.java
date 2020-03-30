package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class EpsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epson);

        RecyclerView epsonView = findViewById(R.id.rv_epson);
        List<Produk> epson = new ArrayList<>();

        epson.add(new Produk(R.drawable.epson2,"EPSON L120","Maksimal kertas ukuran A4, USB Conectivity","Rp. 1.599.000"));
        epson.add(new Produk(R.drawable.epson3,"EPSON M100","A4, USB","Rp. 1.879.000"));
        epson.add(new Produk(R.drawable.epson4,"EPSON L1110","Maksimal kertas ukuran A4","Rp. 1.899.000"));
        epson.add(new Produk(R.drawable.epson6,"EPSON L3110","Maksimal kertas ukuran A4,Print, copy & scan","Rp. 1.990.000"));
        epson.add(new Produk(R.drawable.epson5,"EPSON M200","A4, 1440 x 720 dpi, Black/White 34 ppm, Print 1200 x 2400 dpi, Scan Black/White 34 ppm Copy","Rp. 2.199.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, epson);
        epsonView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        epsonView.setLayoutManager(layoutManager);
    }
}
