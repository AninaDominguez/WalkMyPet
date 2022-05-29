package com.example.walkmypet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Propietario extends AppCompatActivity {

    ListView lista1;
    String [] textos1 = {"WILSON", "LAIA", "KIRA", "BRUNO", "OTROS"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_dueno) ;


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ubicación");
        builder.setMessage("¿Permites que esta app active tu ubicación?");

        builder.setPositiveButton("Aceptar", null);
        builder.setNegativeButton("Cancelar", null);
        AlertDialog dialog = builder.create();
        dialog.show();
        lista1 = findViewById(R.id.listadueno);



        ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, textos1);


        lista1.setAdapter(adapter1);

        lista1.setClickable(true);
         lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                Object o = lista1.getItemAtPosition(position);


                // Realiza lo que deseas, al recibir clic en el elemento de tu listView determinado por su posicion.
                Log.i("Click", "click en el elemento " + position + " de mi ListView");



            }
        });


    }

    /*//Clase propietario, con sus mascotas en Array
    String name;
    String surname;
    int photo;
    ArrayList<Mascota> mascotas = new ArrayList<>();



    //Generados Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    */


    public void goToBack(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
