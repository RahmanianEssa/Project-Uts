package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.LaptopAdapter;
import com.nian.project_uts.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class LaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        RecyclerView teamsView = findViewById(R.id.rv_laptop);

        List<Computer> teams = new ArrayList<>();
        teams.add(new Computer(R.drawable.acer,"Acer E5-573 Laptop","Processor : intel core i3", "Rp7.700.000" ));
        teams.add(new Computer(R.drawable.hp, "HP Spectre x360 - 13-ap0052tu", "Processor : intel core i7" , "Rp24.009.020"  ));
        teams.add(new Computer(R.drawable.asus,"ASUS VivoBook E402BA","Processor: AMD A4-9125" ,"Rp3.649.000"));
        teams.add(new Computer(R.drawable.tosibah,"TOSHIBA satellite C40-A106 ", " processor : Intel Core i3-2348M", "Rp 6.045.000"));
        teams.add(new Computer(R.drawable.acer2,"ACER Swift 3 SF314-54 ","Processor: Intel Core i7-8550U","Rp 13.831.900"));
        teams.add(new Computer(R.drawable.dell, "DELL Vostro 14-3480","Processor: Intel Core i5-8265U","Rp 11.119.000"));

        LaptopAdapter adapter = new LaptopAdapter(this,teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
    }

