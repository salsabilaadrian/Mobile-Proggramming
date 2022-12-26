package com.example.daur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buy_now = findViewById(R.id.buy_now);
        buy_now.setOnClickListener(this);
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
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buy_now:
                Intent pindahshop = new Intent(Home.this, Shop.class);
                startActivity(pindahshop);
                break;
        }
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
                Intent pindahshop = new Intent(Home.this, Shop.class);
                startActivity(pindahshop);
                return true;
            case R.id.home:
                Intent pindahhome = new Intent(Home.this, Home.class);
                startActivity(pindahhome);
                return true;
            case R.id.logout:
                Intent pindahregis = new Intent(Home.this, MainActivity.class);
                startActivity(pindahregis);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}