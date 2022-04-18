package com.example.walkmypet;

import java.util.ArrayList;

public class Propietario {

    //Clase propietario, con sus mascotas en Array
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
}
