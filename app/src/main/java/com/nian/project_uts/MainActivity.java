package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void laptophandler(View view) {
        Intent intent = new Intent(this, LaptopActivity.class);
        startActivity(intent);
    }

    public void printerhandler(View view) {
        Intent intent = new Intent(this, PrinterActivity.class);
        startActivity(intent);
    }

    public void aksesorishandler(View view) {
        Intent intent = new Intent(this, AksesoriesActivity.class);
        startActivity(intent);
    }
}
