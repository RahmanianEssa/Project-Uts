package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.LaptopAdapter;
import com.nian.project_uts.models.Computer;

import java.util.ArrayList;
import java.util.List;

public class LaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        RecyclerView laptopView = findViewById(R.id.rv_laptop);
        List<Computer> laptop = new ArrayList<>();
        laptop.add(new Computer(R.drawable.acer, "Acer","1"));
        laptop.add(new Computer(R.drawable.asus, "Asus","2"));
        laptop.add(new Computer(R.drawable.hp,"Hp","3"));
        laptop.add(new Computer(R.drawable.dell,"Dell","4"));


        LaptopAdapter adapter = new LaptopAdapter(this,laptop);
        laptopView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        laptopView.setLayoutManager(layoutManager);
    }
    }

