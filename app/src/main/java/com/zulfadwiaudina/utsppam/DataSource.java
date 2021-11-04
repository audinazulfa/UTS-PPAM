package com.zulfadwiaudina.utsppam;

import android.content.Context;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Produk> getData(Context context) {
        ArrayList<Produk>list = new ArrayList<Produk>();
        list.add(new Produk(context.getDrawable(R.drawable.cheesecake), "Cheese Cake", 20000, "Cheese cake menu terbaru"));
        list.add(new Produk(context.getDrawable(R.drawable.donut), "Donut", 8000, "Donut menu terfavorit"));
        list.add(new Produk(context.getDrawable(R.drawable.black_salad), "Black Salad", 25000, "Black Salad menu terlaris"));
        list.add(new Produk(context.getDrawable(R.drawable.batagor), "Batagor", 10000, "Batagor menu terlaris"));
        list.add(new Produk(context.getDrawable(R.drawable.mie_goreng), "Mie Goreng", 22000, "Mie goreng menu terlaris"));
        list.add(new Produk(context.getDrawable(R.drawable.cappuchino), "Hot Cappuchino", 18000, "Hot Cappuchino menu terfavorit"));
        return list;
    }
}
