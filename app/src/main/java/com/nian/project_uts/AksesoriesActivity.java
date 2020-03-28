package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.AksesoriesAdapter;
import com.nian.project_uts.models.Computer;

import java.util.ArrayList;
import java.util.List;

public class AksesoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksesories);

        RecyclerView aksesoriesView = findViewById(R.id.rv_aksesoris);

        List<Computer> aksesoris = new ArrayList<>();

        aksesoris.add(new Computer(R.drawable.fd,"Flashdisk"));
        aksesoris.add(new Computer(R.drawable.mouse,"Mouse"));
        aksesoris.add(new Computer(R.drawable.hdmi,"Hdmi"));

        AksesoriesAdapter adapter = new AksesoriesAdapter(this, aksesoris);
        aksesoriesView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        aksesoriesView.setLayoutManager(layoutManager);

    }
}
