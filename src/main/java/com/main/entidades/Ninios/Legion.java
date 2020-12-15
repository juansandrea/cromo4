package com.main.entidades.Ninios;

public class Legion extends Ninio {

    private String nombre;

    public Legion() {
        super();
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Legion( String nombre , int adtitud, Traje traje, Maquillaje maquillaje, int caramelos) {
        super();
    }

}
