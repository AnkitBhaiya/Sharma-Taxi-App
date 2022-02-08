package com.ankitsharma.sharmataxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    EditText userName,email,password,confirmPassword;
    Button button;
    DatabaseReference DbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_register);
        userName = findViewById (R.id.username);
        email = findViewById (R.id.email);
        password = findViewById (R.id.password);
        confirmPassword = findViewById (R.id.confirm_password);
        button = findViewById (R.id.login);
        DbRef =FirebaseDatabase.getInstance ().getReference ().child ("Students");

        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                insertData();
            }
        });

    }

    private void insertData(){

            String name = userName.getText ().toString ();
            String Email = email.getText ().toString ();
            String Password = password.getText ().toString ();

            User user = new User (name,Email,Password);
            DbRef.push ().setValue (user);
            Toast.makeText (RegisterActivity.this, "Successfully Data Inserted", Toast.LENGTH_SHORT).show ();
           Intent i = new Intent (RegisterActivity.this,MapsActivity.class);
           startActivity (i);
    }

}