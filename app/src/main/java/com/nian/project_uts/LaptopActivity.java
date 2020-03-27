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
        teams.add(new Computer("http://www.laptoppricelist.in/acer-e5-573-laptop-i3500gbw8-1.html","Acer E5-573 Laptop","Processor : intel core i3", "Rp7.700.000" ));
        teams.add(new Computer("https://store.hp.com/id-id/default/laptops-tablets/hp-spectre-x360-13-ap0052tu-5mc04pa.html", "HP Spectre x360 - 13-ap0052tu", "Processor : intel core i7" , "Rp24.009.020"  ));
        teams.add(new Computer("asus.com/id/Laptops/ASUS-VivoBook-E402BA/","ASUS VivoBook E402BA","Processor: AMD A4-9125" ,"Rp3.649.000"));
        teams.add(new Computer("https://id.priceprice.com/TOSHIBA-Satellite-C40-A106-6435/","TOSHIBA satellite C40-A106 ", " processor : Intel Core i3-2348M", "Rp 6.045.000"));
        teams.add(new Computer("https://www.bhinneka.com/acer-swift-3-sf314-54-core-i7-8550u-silver-sku3323413031","ACER Swift 3 SF314-54 ","\n" +
                "Processor: Intel Core i7-8550U","Rp 13.831.900"));
        teams.add(new Computer("https://www.bhinneka.com/dell-vostro-14-3480-win10pro-core-i5-8265u-sku3324420764"," \n" +
                "DELL Vostro 14-3480","Processor: Intel Core i5-8265U","Rp 11.119.000"));

        LaptopAdapter adapter = new LaptopAdapter(this,teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }

}
