package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cuidador extends AppCompatActivity {

    Button btnDisponibilidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_walker);
        btnDisponibilidad=findViewById(R.id.btnDisponibilidad);

        btnDisponibilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disponobilidad(view);
            }
        });
    }
    public void disponobilidad(View view){
        Intent intent = new Intent(getApplicationContext(),DatosCuidadorActivity.class);
        startActivity(intent);
    }
}