package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListadoCuidadorActivity extends AppCompatActivity {

    ListView listacuidador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_cuidador);

        listacuidador = (ListView) findViewById(R.id.recivlerVwCuidador);

        ArrayList<String> listaCuidadores = new ArrayList<>();
        listaCuidadores.add("Cristian Fernandez");
        listaCuidadores.add("Aray Perez");
        listaCuidadores.add("Carla Garcia");
        listaCuidadores.add("Fer Rodriguez");
        listaCuidadores.add("Marta Gomez ");
        listaCuidadores.add("Nico Sanchez ");

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaCuidadores);
        listacuidador.setAdapter(adaptador);



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