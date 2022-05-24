package com.example.walkmypet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Propietario extends AppCompatActivity {

    ListView lista1;
    String [] textos1 = {"                                        WILSON", "                                     LAIA", "                                     KIRA", "                                     BRUNO", "                                        Otros"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta_dueno) ;

        lista1 = findViewById(R.id.listadueno);

        ListAdapter adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, textos1);

        lista1.setAdapter(adapter1);

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
