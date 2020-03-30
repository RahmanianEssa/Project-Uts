package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class PrintHpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_hp);

        RecyclerView printHpView = findViewById(R.id.rv_php);

        List<Produk> printHp = new ArrayList<>();
        printHp.add(new Produk(R.drawable.php1,"HP Deskjet 1112","A4, 1200 x 1200 dpi, Black/White 20 ppm Print, Color 16 ppm Print, Tray 1# 60, USB","Rp. 429.000"));
        printHp.add(new Produk(R.drawable.php2,"HP Deskjet Ink Advantage 1115","A4, 1200 x 1200 dpi, ISO Up to 7.5 ppm, Draft Up to 20 ppm","Rp. 499.000"));
        printHp.add(new Produk(R.drawable.php3,"HP DeskJet Ink Advantage 213","A4, 4800 x 1200 dpi, Black/White 20 ppm Print, Color 16 ppm Print, 1200 dpi Scan, Tray 1# 60, USB","Rp. 599.000"));
        printHp.add(new Produk(R.drawable.php4,"HP DeskJet 2132 All-in-One Printer","A4, 4800 x 1200 dpi, 20 (BW) ppm Print, 16 (Color) ppm Print, 1200 dpi Scan, Copy, Tray 1# 60, USB","Rp. 599.000"));
        printHp.add(new Produk(R.drawable.php5,"HP Ink Tank 315 All-in-One","Print, copy, scan, USB, Black (best): Up to 1200 x 1200 rendered dpi; Colour (best): Up to 4800 x 1200 optimised dpi colour","Rp. 1.599.000"));
        printHp.add(new Produk(R.drawable.php6,"HP Laserjet M28a","Mono colour print scan copy with USB","Rp. 1.799.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, printHp);
        printHpView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        printHpView.setLayoutManager(layoutManager);


    }
}
