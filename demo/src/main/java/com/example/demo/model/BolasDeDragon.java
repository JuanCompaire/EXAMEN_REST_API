package com.example.demo.model;


public class BolasDeDragon {
    private String ubicacion;
    private int num_estrella;

    public BolasDeDragon(String ubicacion, int num_estrella) {
        this.ubicacion = ubicacion;
        this.num_estrella = num_estrella;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumEstrella() {
        return num_estrella;
    }

    public void setNumEstrella(int num_estrella) {
        this.num_estrella = num_estrella;
    }
}