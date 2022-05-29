package com.example.walkmypet;

import android.os.Bundle;
import android.widget.TextView;

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



    }



    //Generados Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
