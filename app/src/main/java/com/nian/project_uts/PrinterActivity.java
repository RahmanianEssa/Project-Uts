package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.PrinterAdapter;
import com.nian.project_uts.models.Computer;

import java.util.ArrayList;
import java.util.List;

public class PrinterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printer);
        RecyclerView printerView = findViewById(R.id.rv_printer);

        List<Computer> printer = new ArrayList<>();
        printer.add(new Computer(R.drawable.printerhp,"Hp"));
        printer.add(new Computer(R.drawable.samsung,"Samsung"));
        printer.add(new Computer(R.drawable.canon,"Canon"));
        printer.add(new Computer(R.drawable.epson,"Epson"));

        PrinterAdapter adapter = new PrinterAdapter(this,printer);
        printerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        printerView.setLayoutManager(layoutManager);
    }
}
