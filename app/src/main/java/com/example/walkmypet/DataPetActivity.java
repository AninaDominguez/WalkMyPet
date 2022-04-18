package com.example.walkmypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DataPetActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datapet);
        listView =findViewById(R.id.listview);
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("cuidador 1");
        arrayList.add("cuidador 2");
        arrayList.add("cuidador 3");
        arrayList.add("cuidador 4");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
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
