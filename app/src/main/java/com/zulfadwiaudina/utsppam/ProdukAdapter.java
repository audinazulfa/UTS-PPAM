package com.zulfadwiaudina.utsppam;

import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProdukAdapter extends RecyclerView.Adapter <ProdukAdapter.ListViewHolder> {
    private ArrayList<Produk> listproduk;
    ProdukAdapter(ArrayList<Produk> item) {
        this.listproduk = item;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.produk, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        Produk produk = listproduk.get(position);
        holder.foto.setImageDrawable(produk.gambar);
        holder.nama.setText(produk.judul);
        holder.harga.setText(String.valueOf(produk.harga));
    }

    @Override
    public int getItemCount() {
        return listproduk.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView foto;
        public TextView nama, harga;
        public ListViewHolder(View view) {
            super(view);
            foto = view.findViewById(R.id.foto_produk);
            nama = view.findViewById(R.id.nama_produk);
            harga = view.findViewById(R.id.harga_produk);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selectedDetail = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra("id", selectedDetail);
            view.getContext().startActivity(intent);
        }
    }


}
