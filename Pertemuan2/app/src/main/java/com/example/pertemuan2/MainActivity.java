package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView angkaKounter;
    int angka=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkaKounter=FindViewById(R.id.kounter);

    }

    public void toastklik(View view) {
        Toast.makeText( context: this, text "INI ADALAH TOAST", Toast.LENGTH_LONG).show();
    }

    public void tblkounter(View view) {
        angka=angka+1
        angkaKounter.setText(Integer.toString(angka));

    }
}