package com.example.myfirebaseapp;

import

import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList; ...

public class TampilSemuaData extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;

    ArrayList<String> arrayTampil=new ArrayList<>();
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_semua_data);
        listView=findViewById(R.id.listdataku);
        databaseReference=FirebaseDatabase.getInstance().getReference().child("siswa");
        arrayAdapter=new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,arrayTampil);
        listView.setAdapter();

        databaseReference.addChildEeventListener(new ChildEventListener)

    }


}
