package com.zulfadwiaudina.utsppam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.login);
        button.setOnClickListener(view -> {
            TextView text = findViewById(R.id.username);
            TextView pass = findViewById(R.id.password);

            String username = text.getText().toString();
            String password = pass.getText().toString();

            if (username.equals("audina")&& password.equals("1234")) {
                Intent intent = new Intent(getApplicationContext(), BerandaActivity.class);
                startActivity(intent);
                this.finish();
            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}