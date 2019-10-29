package com.example.recycleview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview2.adapters.MahasiswaAdapter;
import com.example.recycleview2.models.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMahasiswa;
    List<Mahasiswa> listMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMahasiswa =findViewById(R.id.rvMahasiswa);
        Mahasiswa mahasiswa = new Mahasiswa("100100110", "Syahdanny");
        listMahasiswa.add(mahasiswa);

        mahasiswa = new Mahasiswa("100100110", "Syahdanny");
        listMahasiswa.add(mahasiswa);

        mahasiswa = new Mahasiswa("100100110", "Syahdanny");
        listMahasiswa.add(mahasiswa);

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(listMahasiswa);

        rvMahasiswa.setAdapter(mahasiswaAdapter);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false));
    }
}

