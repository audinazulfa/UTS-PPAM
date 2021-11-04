package com.zulfadwiaudina.utsppam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Produk> list = DataSource.getData(getApplicationContext());
        Produk produk = list.get(id);

        if (produk != null) {
            ImageView gambar = findViewById(R.id.foto_produk);
            TextView judul = findViewById(R.id.nama_produk);
            TextView harga = findViewById(R.id.harga_produk);
            TextView deskripsi = findViewById(R.id.deskripsi_produk);

            gambar.setImageDrawable(produk.gambar);
            judul.setText(produk.judul);
            harga.setText(String.valueOf(produk.harga));
            deskripsi.setText(produk.deskripsi);
        }
    }


}