package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class CanonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canon);

        RecyclerView canonView = findViewById(R.id.rv_canon);
        List<Produk> canon = new ArrayList<>();

        canon.add(new Produk(R.drawable.canon2,"CANON Pixma iX6770","A3+,USB 2.0 Hi-Speed","Rp. 2.999.000"));
        canon.add(new Produk(R.drawable.canon4,"CANON Pixma MX497","A4, 4800 x 1200 dpi, Black/White 8.8 ipm Print, Color 4.4 ipm Print, 600 x 1200 dpi Scan","Rp. 1.250.000"));
        canon.add(new Produk(R.drawable.canon5,"CANON Pixma MG7170","Ukuran kertas maksimal A4,Contact Image Sensor (CIS) , USB 2.0 Hi-Speed, Card Slots","Rp. 2.699.000"));
        canon.add(new Produk(R.drawable.canon6,"CANON Pixma G2010","Maksimal kertas ukuran A4,USB 2.0,Print, Scan, Copy","Rp. 1.715.000"));
        canon.add(new Produk(R.drawable.canon7,"CANON Pixma G1010","Maksimal kertas ukuran A4,USB 2.0 Hi-Speed","Rp. 1.399.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, canon);
       canonView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        canonView.setLayoutManager(layoutManager);

    }
}
