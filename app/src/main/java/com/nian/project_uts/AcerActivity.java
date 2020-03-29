package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class AcerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acer);

        RecyclerView acerView = findViewById(R.id.rv_acer);

        List<Produk> acer = new ArrayList<>();

        acer.add(new Produk(R.drawable.aceraspire,"Acer Aspire ES1-432","Cpu: Intel Celeron, Ram: 2Gb","Rp. 3.650.000"));
        acer.add(new Produk(R.drawable.acerone,"Acer One 14 Z1402", "Cpu: Intel Core i3, Ram:2Gb","Rp. 7.099.000"));
        acer.add(new Produk(R.drawable.aceraspire3,"Acer Aspire 3 A315-41-R3LC","Cpu : Amd Ryzen 3, Ram :4Gb","Rp. 5.999.000"));
        acer.add(new Produk(R.drawable.acerspin3,"Acer Spin 3 SP314-51-57XK","Cpu : Intel Core i5, Ram: 8Gb", "Rp. 9.799.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, acer);
        acerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        acerView.setLayoutManager(layoutManager);
    }
}
