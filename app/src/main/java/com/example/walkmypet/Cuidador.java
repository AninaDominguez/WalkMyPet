package com.example.walkmypet;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cuidador extends AppCompatActivity {

    //Clase cuidador, con los atributos necesarios para el constructor, tambien el array de fechas
    String name;
    String surname;
    String alias;
    String email;
    Float rating;

    //Generados Getters y Setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public List<Calendar> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<Calendar> availableDates) {
        this.availableDates = availableDates;
    }

    public void setName(String name) {
        this.name = name;
    }

    int photo;
    List<Calendar> availableDates = new ArrayList<>();
}
