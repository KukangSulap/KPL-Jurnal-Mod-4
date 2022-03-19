package com.barney.kpljurnalmod4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView darto  = findViewById(R.id.mio);

        SimpleDataBase<Double> perjuangan = new SimpleDataBase(darto);

        perjuangan.AddNewData(12.0);
        perjuangan.AddNewData(34.0);
        perjuangan.AddNewData(56.0);

        perjuangan.PrintAllData();

    }
}