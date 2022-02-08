package com.ankitsharma.sharmataxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ankitsharma.sharmataxi.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnlogin,btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        btnlogin = findViewById (R.id.btn_sign_in);
        btnsignup = findViewById (R.id.btn_sign_up);
        btnlogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, LoginActivity.class);
                startActivity (intent);
            }
        });

        btnsignup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, RegisterActivity.class);
                startActivity (intent);
            }
        });

    }
}