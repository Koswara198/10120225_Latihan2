package com.example.a10120225_latihan2;
// Nama : Adi Tata Koswara
// NIM : 10120225
// Kelas : IF-6
// Tanggal Pengerjaan : 26 April 2023
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
    public void btnRegister(View view){
        Intent intent = new Intent(this, com.example.a10120225_latihan2.RegisterActivity.class);
        startActivity(intent);
    }
}