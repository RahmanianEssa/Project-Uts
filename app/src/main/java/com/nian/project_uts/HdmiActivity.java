package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class HdmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdmi);

        RecyclerView hdmiView = findViewById(R.id.rv_hdmi);

        List<Produk> hdmi = new ArrayList<>();
        hdmi.add(new Produk(R.drawable.hdmi2,"APPLE HDMI to DVI Adapter","Cable HDMI to DVI adapter"," Rp 899.000"));
        hdmi.add(new Produk(R.drawable.hdmi3,"DBI Cable HDMI to VGA Port","HDMI to VGA Port","Rp 100.000"));
        hdmi.add(new Produk(R.drawable.hdmi4,"ANYLINX Micro HDMI to VGA Adapter - Hitam","Connector HDMI to VGA Adapter","Rp 89.000"));
        hdmi.add(new Produk(R.drawable.hdmi5,"LENOVO USB C to HDMI Adapter C103","USB C to HDMI Adapter","Rp 1.099.000"));
        hdmi.add(new Produk(R.drawable.hdmi6,"LENOVO HDMI to VGA Adapter 20M 0B47069","HDMI to VGA Adapter","Rp 470.000"));
        hdmi.add(new Produk(R.drawable.hdmi7,"LENOVO HDMI to VGA Adapter CH580","HDMI to VGA Adapter","Rp 810.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, hdmi);
        hdmiView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        hdmiView.setLayoutManager(layoutManager);

    }
}
