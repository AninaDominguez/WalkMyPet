package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

public class Mascota extends AppCompatActivity {

    //Clase mascota, esta clase será solo a la hora de mostrar cada cuidador sus mascotas
    String name;
    String age;
    String specie;
    int photo;

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
