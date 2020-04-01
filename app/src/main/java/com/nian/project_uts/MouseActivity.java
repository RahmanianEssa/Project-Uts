package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class MouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse);

        RecyclerView mouseView = findViewById(R.id.rv_mouse);

        List<Produk> mouse = new ArrayList<>();
        mouse.add(new Produk(R.drawable.mouse2,"HP M10 Mouse Optical","Panjang Kabel: 1meter","Rp. 49.000"));
        mouse.add(new Produk(R.drawable.mouse3,"LOGITECH B175 Wireless Mouse","Wireless Mouse, 2.4 GHz (Unifying), USB Receiver","Rp. 109.000"));
        mouse.add(new Produk(R.drawable.mouse4,"HP Gaming Mouse M260 - Black","Transmission type : USB","Rp. 145.000"));
        mouse.add(new Produk(R.drawable.mouse5,"MICROSOFT Wireless Mobile Mouse 1850 - Magenta Pink","Wireless Mobile Mouse, USB","Rp. 160.000"));
        mouse.add(new Produk(R.drawable.mouse6,"LOGITECH M590 Wireless Mouse - Red","Bluetooth Smart dan koneksi 2.4GHz wireless","Rp. 375.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, mouse);
        mouseView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mouseView.setLayoutManager(layoutManager);
    }
}
