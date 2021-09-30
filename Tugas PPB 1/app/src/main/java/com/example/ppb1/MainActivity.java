package com.example.ppb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("selamat datang di pemrograman java");
        Log.i(TAG, "onCreate: ");
        Log.i(TAG, "Selamat Datang di Bahasa Pemrograman");
    }
}