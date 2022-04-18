package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EditarMascotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_mascota);
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