package com.barney.kpljurnalmod4;

import android.widget.TextView;

class Penjumlahan <T> {

//    Double angka1;
    TextView arielayaka;

    public Penjumlahan(TextView arielayaka) {
        this.arielayaka = arielayaka;

    }

    void JumlahTigaAngka(Double angka1, Double angka2, Double angka3){

        Double bestdps = angka1 + angka2 + angka3;
        arielayaka.setText(""+bestdps);
    }
}
