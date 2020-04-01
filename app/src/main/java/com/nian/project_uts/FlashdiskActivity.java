package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class FlashdiskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashdisk);

        RecyclerView fdView = findViewById(R.id.rv_fd);

        List<Produk> fd = new ArrayList<>();
        fd.add(new Produk(R.drawable.fd1,"Sandisk Ixpand IX40N ","Kapasitas 64GB","Rp. 479.000"));
        fd.add(new Produk(R.drawable.fd2,"APACER AH223-16GB","Kapasitas 16GB","Rp. 65.000"));
        fd.add(new Produk(R.drawable.fd3,"SANDISK Cruzer Blade [CZ50]","Kapasitas 64GB","Rp. 139.000"));
        fd.add(new Produk(R.drawable.fd4,"PNY Lovely New York USB 2.0","Kapasitas 16GB","Rp. 115.000"));
        fd.add(new Produk(R.drawable.fd5,"TOSHIBA Hayabusa USB 3.0","Kapasitas 32GB","Rp. 99.000"));
        fd.add(new Produk(R.drawable.fd6,"PATRIOT Viper - 128GB","Kapasitas 128GB","Rp. 599.000"));


        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, fd);
        fdView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        fdView.setLayoutManager(layoutManager);
  }
}
