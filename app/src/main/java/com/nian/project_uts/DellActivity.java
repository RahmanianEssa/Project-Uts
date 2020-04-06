package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class DellActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell);

        RecyclerView dellView = findViewById(R.id.rv_dell);

        List<Produk> dell = new ArrayList<>();

        dell.add(new Produk(R.drawable.dell2,"DELL Vostro 14-3480 WIN10Pro","Cpu: Intel Core i5-8265U, Ram: 4gb DDR4","Rp.11.119.000"));
        dell.add(new Produk(R.drawable.dell3,"Dell XPS 13 9360","Cpu: Intel Core i5-8250, Ram: 8Gb dan 256Gb SSD","Rp.15.200.00"));
        dell.add(new Produk(R.drawable.dell4,"Dell XPS 13 9370","Cpu: Intel Core i7-8550U, Ram: RAM 16GB LPDDR3","Rp.22.500.000"));
        dell.add(new Produk(R.drawable.dell5,"Dell XPS 13 9350","Cpu: Intel Core i7-6560 , Ram: 16Gb","Rp.23.990.000"));
        dell.add(new Produk(R.drawable.dell6,"Dell XPS 13 9380","Cpu: Intel Core i7-8565U, Ram: 16Gb","Rp.33.500.000"));
        dell.add(new Produk(R.drawable.dell7,"Dell Inspiron 14-3442","Cpu: Core i5, Ram: 4Gb","Rp 3.895.000"));
        dell.add(new Produk(R.drawable.dell8,"Dell Inspiron 14-N4050","Cpu: Core i5, Ram: 4Gb","Rp 4.770.000"));
        dell.add(new Produk(R.drawable.dell9,"Dell Alienware 17","Cpu: Core i7, Ram 16Gb","Rp 24.450.000"));
        dell.add(new Produk(R.drawable.dell10,"Dell Inspiron 13-5378","Cpu: Pentium Dual Core, Ram: 16Gb","Rp 8.250.000"));
        dell.add(new Produk(R.drawable.dell11,"Dell Inspiron 11-3168","Cpu:  Pentium Quad Core, Ram: 4Gb","Rp 3.850.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, dell);
        dellView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        dellView.setLayoutManager(layoutManager);
    }
}
