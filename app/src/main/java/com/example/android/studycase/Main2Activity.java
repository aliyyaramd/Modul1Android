package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView jumlah;
    TextView tempat;
    TextView menu;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String total = intent.getStringExtra("jumlah");
        String namaTempat = intent.getStringExtra("tempat");
        String Makanan = intent.getStringExtra("menu");
        String hargaMakanan = intent.getStringExtra("harga");
        int jmlHarga = Integer.valueOf(total)*Integer.valueOf(hargaMakanan);

        jumlah = (TextView) findViewById(R.id.porsi1);
        jumlah.setText(total);
        tempat = (TextView) findViewById(R.id.judul_1);
        tempat.setText(namaTempat);
        menu = (TextView) findViewById(R.id.hasil2);
        menu.setText(Makanan);


        harga = (TextView) findViewById(R.id.hasil3);
        harga.setText(String.valueOf(jmlHarga));


        if (jmlHarga > 80000) {
            Toast toast = Toast.makeText(this, "Tidak Bisa Makan Di sini, Uang Tidak Cukup!", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
