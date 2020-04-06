package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class HpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);

        RecyclerView hpView = findViewById(R.id.rv_hp);

        List<Produk> hp = new ArrayList<>();

        hp.add(new Produk(R.drawable.hp1,"HP Probook 440 G5","Cpu: Intel Core i5, Ram: 4Gb","Rp. 9.422.000"));
        hp.add(new Produk(R.drawable.hp2,"HP 15-BA004AX","Cpu: AMD, Ram: 8Gb","Rp. 6.300.000"));
        hp.add(new Produk(R.drawable.hp3,"HP Envy 13-AD00-TX","Cpu: Intel Core i5, Ram: 8Gb","Rp. 15.485.000"));
        hp.add(new Produk(R.drawable.hp4,"HP 15-BA004AX","Cpu: AMD, Ram: 8Gb","Rp. 6.300.000"));
        hp.add(new Produk(R.drawable.hp5,"HP 14-BW005AU","Cpu: AMD A4, Ram: 4Gb","Rp. 3.499.000"));
        hp.add(new Produk(R.drawable.hp6,"HP 14s-cf0110tu","Cpu: Core i3, Ram 8Gb","Rp 5.679.000"));
        hp.add(new Produk(R.drawable.hp7,"HP Stream 11-d016tu","Cpu: Celeron,Ram: 2Gb","Rp 3.190.000"));
        hp.add(new Produk(R.drawable.hp8,"HP EliteBook 840 G1","Cpu: Core i7, Ram: 8Gb","Rp 16.999.000"));
        hp.add(new Produk(R.drawable.hp9,"HP OMEN X","Cpu: Core i7, Ram:12Gb","Rp 14.200.000"));
        hp.add(new Produk(R.drawable.hp10,"HP Pavilion 14-v041tx","Cpu: Core i5,Ram: 4Gb","Rp 7.385.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, hp);
        hpView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        hpView.setLayoutManager(layoutManager);
    }
}
