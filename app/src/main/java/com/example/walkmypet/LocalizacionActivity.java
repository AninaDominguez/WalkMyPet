package com.example.walkmypet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LocalizacionActivity extends AppCompatActivity {
    Button btn1, btn2;
    Boolean pasar=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacion);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ubicación");
        builder.setMessage("¿Permites que esta app active tu ubicación?");

        builder.setPositiveButton("Aceptar", null);
        builder.setNegativeButton("Cancelar", null);
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}