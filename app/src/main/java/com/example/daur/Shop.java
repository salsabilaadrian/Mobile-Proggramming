package com.example.daur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Shop extends AppCompatActivity {

    RecyclerView rvBarang;
    ArrayList<Barang> listBarang;
    BarangAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        rvBarang = findViewById(R.id.rvBarang);
        listBarang = new ArrayList<>();

        Barang barang1 = new Barang();
        barang1.title = "Recycle Chair";
        barang1.desc = "This is a recycle chair";
        barang1.price = "900.000";
        barang1.image = R.drawable.chair;

        Barang barang2 = new Barang();
        barang2.title = "Recycle Kids Chair";
        barang2.desc = "This is a recycle chair";
        barang2.price = "1.000.000";
        barang2.image = R.drawable.kids_chair;

        for (int i = 0; i < 100; i++){
            listBarang.add(barang1);
            listBarang.add(barang2);
        }

        rvBarang.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new BarangAdapter(this, listBarang);
        rvBarang.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.shop:
                Intent pindahshop = new Intent(Shop.this, Shop.class);
                startActivity(pindahshop);
                return true;
            case R.id.home:
                Intent pindahhome = new Intent(Shop.this, Home.class);
                startActivity(pindahhome);
                return true;
            case R.id.logout:
                Intent pindahregis = new Intent(Shop.this, MainActivity.class);
                startActivity(pindahregis);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}