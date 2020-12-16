package com.main.entidades.Ninios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Legion {

    private String nombre;
    private int poderDeSusto;

   public Legion(String nombre,int poderDeSusto){
       this.nombre = nombre;
       this.poderDeSusto = poderDeSusto;
   }

    public Legion() {

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
    public String toString() { return "Legion{" + "nombre='" + nombre + '\'' + ", poderDeSusto=" + poderDeSusto + '}';
    }

    public  void elegirLider(ArrayList<Ninio> miembros){
        Legion elegirLider = new Legion();
        int mayorAdtitud = -9;


        for (Ninio esElLider : miembros)
            if (esElLider.getAdtitud() > mayorAdtitud) {
                mayorAdtitud = esElLider.getAdtitud();
                elegirLider = esElLider;

            }

        System.out.println("Es El Lider: "  + elegirLider.getNombre() +" "+"Y Su Poder De susto Es: "+ elegirLider.getPoderDeSusto());

    }

    public void reportar(){
       try{
           File reporte = new File("reporte.txt");
           reporte.canWrite(reporte.);
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






