package com.example.yummyhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtUserName,txtUserPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtUserName = findViewById(R.id.txtUserName);
        txtUserPassword = findViewById(R.id.txtPassword);

        Intent intent = getIntent();
        txtUserName.setText(intent.getStringExtra("userName"));
        txtUserPassword.setText(intent.getStringExtra("userPassword"));

    }
}