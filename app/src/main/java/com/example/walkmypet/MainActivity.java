package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;

        buttonRegister = findViewById(R.id.comenzarRegistroButton);

    }

    public void goToRegister(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }



}