package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class DatosCuidadorActivity extends AppCompatActivity {


    //Métodos de la vista de cuidador, en los cuales podremos contratarlo, ver su rating , y demás
    RatingBar ratingBar;
    CalendarView calendarView;
    Long date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_cuidador);

        ratingBar = findViewById(R.id.ratingBar);
        calendarView = findViewById(R.id.calendarView);


    }

    public void contratarCuidador(Cuidador cuidador){

        date = calendarView.getDate();
        if(date != 0){
            calendarView.setDate(date);

        }


        }

    //Método para ir al perfil del propietario
    public void goToMyProfile(View view){
        Intent intent = new Intent(this,EditarMascotaActivity.class);
        startActivity(intent);


    }
    //Método para volver al inicio
    public void goToBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);


    }




    }


