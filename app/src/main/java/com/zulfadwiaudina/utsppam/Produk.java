package com.zulfadwiaudina.utsppam;

import android.graphics.drawable.Drawable;

public class Produk {
    String judul;
    String deskripsi;
    int harga;
    Drawable gambar;

    Produk(Drawable gambar, String judul, int harga,  String deskripsi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

}
