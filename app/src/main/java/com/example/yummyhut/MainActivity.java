package com.example.yummyhut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSign;
    EditText editUserName,editPassword;
    String userName,userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSign = findViewById(R.id.signBtn);
        editUserName = findViewById(R.id.userName);
        editPassword = findViewById(R.id.userPassword);

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = editUserName.getText().toString();
                userPassword = editPassword.getText().toString();

                Intent intent =  new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra("userName",userName);
                intent.putExtra("userPassword",userPassword);
                startActivity(intent);
            }
        });

    }
}