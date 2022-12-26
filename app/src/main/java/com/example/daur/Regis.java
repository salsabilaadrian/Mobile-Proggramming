package com.example.daur;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Regis extends AppCompatActivity implements View.OnClickListener{

    EditText inputEmail;
    EditText inputUsername;
    EditText inputPassword;
    EditText inputConfirmationPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        Button regis_btn = findViewById(R.id.regis_btn);
        regis_btn.setOnClickListener(this);

        inputEmail = findViewById(R.id.inputEmail);
        inputUsername = findViewById(R.id.inputUsername);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmationPassword = findViewById(R.id.inputConfirmPassword);
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
    public void onClick(View view){
        switch(view.getId()){
            case R.id.regis_btn:
                String email = inputEmail.getText().toString();
                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();
                String confirm = inputConfirmationPassword.getText().toString();

                Intent data = new Intent(Regis.this, Home.class);
                data.putExtra("email", email);
                data.putExtra("username", username);
                data.putExtra("password", password);
                data.putExtra("confirm", confirm);
                startActivity(data);
                break;
        }
    }
}