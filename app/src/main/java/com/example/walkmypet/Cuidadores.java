package com.example.walkmypet;

public class Cuidadores {
    private String id,Nombre,password;

    public Cuidadores() {
    }

    public Cuidadores(String id, String nombre) {
        this.id = id;
        this.Nombre = nombre;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
