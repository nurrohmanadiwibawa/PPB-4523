package com.example.myfirebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nimsiswa,namasiswa;
    Button btnsave,btnview;
    DatabaseReference reference;
    Mahasiswa mahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nimsiswa=findViewById(R.id.nimmhs);
        namasiswa=findViewById(R.id.nmmhs);
        btnsave=findViewById(R.id.tblsave);
        mahasiswa=new Mahasiswa();
        reference=FirebaseDatabase.getInstance().getReference().child("Siswa");

        btnsave.setOnClickListener(new View.OnClickListener()){
            @Override
            Public void onClick(View view){
                mahasiswa.setNim(nimsiswa.getText().toString().trim());
                mahasiswa.setNama(namasiswa.getText().toString().trim());
                reference.push().setValue(mahasiswa);
                Toast.makeText(MainActivity.this,"Data Tersimpan",Toast.LENGTH_LONG).show();
            }
        };

    }
}