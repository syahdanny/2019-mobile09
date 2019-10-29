package com.example.recycleview2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview2.R;
import com.example.recycleview2.models.Mahasiswa;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MyViewHolder> {

    public MahasiswaAdapter(List<Mahasiswa> mahasiswaList){
        this.mahasiswaList = mahasiswaList;
    }

    List<Mahasiswa> mahasiswaList;

    @NonNull
    @Override
    public MahasiswaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View mahasiswaView = layoutInflater.inflate(R.layout.list_mahasiswa,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(mahasiswaView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MyViewHolder holder, int position) {
        Mahasiswa mahasiswa = mahasiswaList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.mahasiswaName.setText(mahasiswa.getNama());
        holder.mahasiswaNim.setText(mahasiswa.getNim());
    }

    @Override
    public int getItemCount() {
        return (mahasiswaList != null) ? mahasiswaList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mahasiswaName;
        public TextView mahasiswaNim;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mahasiswaName =itemView.findViewById(R.id.mahasiswaName);
            mahasiswaNim = itemView.findViewById(R.id.mahasiswaNim);
        }
    }
}
