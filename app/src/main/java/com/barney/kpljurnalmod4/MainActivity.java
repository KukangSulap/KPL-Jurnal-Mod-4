package com.barney.kpljurnalmod4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt1 = findViewById(R.id.txtno1);

        Penjumlahan kerja3 = new Penjumlahan(txt1);

        kerja3.JumlahTigaAngka(13.0, 2.0, 20.0);

        TextView darto  = findViewById(R.id.mio);

        SimpleDataBase<Double> perjuangan = new SimpleDataBase(darto);

        perjuangan.AddNewData(12.0);
        perjuangan.AddNewData(34.0);
        perjuangan.AddNewData(56.0);

        perjuangan.PrintAllData();

    }
}