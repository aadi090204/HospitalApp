package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity2 extends AppCompatActivity {

    EditText ed3,ed4,ed5,ed6;
    Button b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up2);


        ed3=(EditText) findViewById(R.id.nam);
        ed4=(EditText) findViewById(R.id.usname);
        ed5=(EditText) findViewById(R.id.psd);
        ed6=(EditText) findViewById(R.id.cpsd);
        b3=(Button) findViewById(R.id.sig);
        b4=(Button) findViewById(R.id.backbt);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob1);

            }
        });

    }
}