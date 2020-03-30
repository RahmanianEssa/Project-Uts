package com.nian.project_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nian.project_uts.adapters.ProductLaptopAdapter;
import com.nian.project_uts.models.Produk;

import java.util.ArrayList;
import java.util.List;

public class PrintBrotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_brother);

        RecyclerView brotherView = findViewById(R.id.rv_bro);

        List<Produk> brother = new ArrayList<>();
        brother.add(new Produk(R.drawable.brother1,"BROTHER HL-L2365DW","A4,Legal,Letter,B5,A5,A6,B6 and Executive,USB 2.0 Hi-Speed , Ethernet, Wireless(Wi-Fi Direct)","Rp. 1.650.000"));
        brother.add(new Produk(R.drawable.brother2,"BROTHER DCP-T310","Ukuran kertas A4,Black/White 12 ppm Print & Color 6 ppm Print","Rp. 1.899.000"));
        brother.add(new Produk(R.drawable.brother3,"Brother DCP-T300","Ukuran Kertas A4, A5, A6, USB","Rp. 1.925.000"));
        brother.add(new Produk(R.drawable.brother4,"BROTHER DCP-T510W","Ukuran Kertas A4, Black/White 11 ppm Print & Color 6 ppm Print","Rp. 2.560.000"));
        brother.add(new Produk(R.drawable.brother5,"BROTHER DCP-L2540DW"," A4,Letter,B5,A5,A6,Executive,Legal,Folio,  USB 2.0 Hi-Speed, Wi-fi Integrated","Rp. 2.455.000"));

        ProductLaptopAdapter adapter = new ProductLaptopAdapter(this, brother);
       brotherView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        brotherView.setLayoutManager(layoutManager);
    }
}
