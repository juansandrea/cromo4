package com.main.entidades.Ninios;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Legion {

    private String nombre;
    private int poderDeSusto;
    private ArrayList<Ninio> miembros;


    public Legion(String nombre,int poderDeSusto){
       this.nombre = nombre;
       this.poderDeSusto = poderDeSusto;
   }

    public Legion(ArrayList<Ninio> miembros) {
       this.miembros = miembros;


    }



    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoderDeSusto() {
        return poderDeSusto;
    }

    public void setPoderDeSusto(int poderDeSusto) {
        this.poderDeSusto = poderDeSusto;
    }

    @Override
    public String toString() { return "Legion " + "nombre='" + nombre+ '\'' + ", poderDeSusto=" + poderDeSusto+ '}';
    }

    public void elegirLider(ArrayList<Ninio> miembros){
        Ninio niño = new Ninio(miembros);
        int mayorAdtitud = -999;

        for (Ninio lider : miembros)
            if (lider.getAdtitud() > mayorAdtitud) {
                mayorAdtitud = lider.getAdtitud();
                niño = lider;


            }
        System.out.println("Este es el lider de la Legion " +niño.getNombreniño()+" "+niño.getAdtitud() +" y sus Poder de susto: " + niño.capacidadDeSusto()  );

    }

    public void reportar(){
       try{
           File reporte = new File("reporte.txt");
           if (reporte.createNewFile()) {
               System.out.println("se creo un reporte " + reporte.getName());
           } else {
               System.out.println("ya existe el reporte ");
           }
       }catch (IOException report){
           System.out.println("Error de escritura en reporte Legion ");
       }

    }



}






