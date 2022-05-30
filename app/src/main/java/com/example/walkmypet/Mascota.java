package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mascota extends AppCompatActivity {

    private TextView txtDepartamento;
    private TextView txtNombre;
    private TextView txtPuesto;
    //Clase mascota, esta clase será solo a la hora de mostrar cada cuidador sus mascotas
    String name;
    String age;
    String specie;
    int photo;
    Button guardar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pet_infomation) ;
        txtDepartamento = findViewById(R.id.txtDepartamento);
        txtNombre = findViewById(R.id.txtNombre);
        txtPuesto = findViewById(R.id.txtPuesto);

        txtNombre.setText(getIntent().getStringExtra("nombre"));
        txtDepartamento.setText(getIntent().getStringExtra("departamento"));
        txtPuesto.setText(getIntent().getStringExtra("puesto"));


        guardar = findViewById(R.id.btnguardar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Mascota.this, "datos guardados", Toast.LENGTH_SHORT).show();

            }
        });

    }



    public void listacuidador(View view){
        Intent intent = new Intent(this, ListadoCuidadorActivity.class);
        startActivity(intent);
    }
    public void getOut (View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void goToMenu(View view){
        Intent intent = new Intent(this,Propietario.class);
        startActivity(intent);

    }
    public void goback(View view){
        Intent intent = new Intent(this,Propietario.class);
        startActivity(intent);

    }
}
