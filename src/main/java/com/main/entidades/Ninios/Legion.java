package com.main.entidades.Ninios;

import com.main.entidades.Adultos.Adulto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Legion {

    private String nombre;
    private int poderDeSusto;
    private ArrayList<Ninio> miembros;
    private Ninio lider;
    private Map<Adulto, Boolean> registroDeSusto;


    public Legion(String nombre,int poderDeSusto){
       this.nombre = nombre;
       this.poderDeSusto = poderDeSusto;
   }

    public Legion(ArrayList<Ninio> miembros) {
       this.miembros = miembros;
       lider = elegirLider(miembros);
       for (Ninio niño1 : miembros)
         this.poderDeSusto += niño1.capacidadDeSusto();

      registroDeSusto = new HashMap<Adulto , Boolean>();


    }


  public Ninio getLider() {
    return lider;
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

    public Ninio elegirLider(ArrayList<Ninio> miembros){
        Ninio niño = new Ninio(miembros);
        int mayorAdtitud = -999;

        for (Ninio lider : miembros) {
          if (lider.getAdtitud() > mayorAdtitud) {
            mayorAdtitud = lider.getAdtitud();
            niño = lider;


          }
        }
        System.out.println("Este es el lider de la Legion " +niño.getNombreniño()+" "+niño.getAdtitud() +" y sus Poder de susto: " + niño.capacidadDeSusto()  );
        return niño;
    }

    public void intentarAsustarA(Adulto adulto){
      int seasustoL= adulto.recibirSusto(poderDeSusto);
      if (seasustoL > 0){
        System.out.println(" La Legion Asuto EL adulto ");
        lider.recibirCaramelos(seasustoL);
        registrarSusto(adulto,true);
      } else {
        registrarSusto(adulto,false);
        System.out.println(" No ASUsta");
      }

    }

    public int sustosTotalesDados(){
      return registroDeSusto.size();
    }

    public void registrarSusto(Adulto adulto, boolean fueAsustado){
      if (fueAsustado == true){
        registroDeSusto.put(adulto,true);
      }
    }

    public void reportar() throws IOException{
       try{
           File reporte = new File("reporte.txt");
           if (reporte.createNewFile()) {
             FileWriter escribir = new FileWriter(reporte);
             for (Ninio niño : miembros){
               escribir.write(niño.getNombreniño() + ", " + niño.capacidadDeSusto() + "\n");
             }
             escribir.close();

               System.out.println("se creo un reporte " + reporte.getName());
           } else {
               System.out.println("ya existe el reporte ");
           }
       }catch (IOException report){
           System.out.println("Error de escritura en reporte Legion ");
       }

    }



}






