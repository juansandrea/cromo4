package com.main.entidades.Ninios;

import com.main.entidades.Adultos.Adulto;

import java.util.ArrayList;
import java.util.Iterator;


public class Ninio {

  private String nombreniño;
  private int caramelos;
  private int adtitud;
  private Traje traje;
  private Maquillaje maquillaje;


  public Ninio(String nombreniño, int adtitud, Traje traje, Maquillaje maquillaje,int caramelos) {
    this.nombreniño = nombreniño;
    this.adtitud = adtitud;
    this.traje = traje;
    this.maquillaje = maquillaje;
    this.caramelos = caramelos;
    capacidadDeSusto();
  }

  public Ninio(ArrayList<Ninio> miembros) {}

  public Ninio() {

  }

  public String getNombreniño() {
    return nombreniño;
  }

  public void setNombreniño(String nombreniño) {
    this.nombreniño = nombreniño;
  }

  public int getCaramelos() {
    return this.caramelos;
  }


  public int getAdtitud() {
    return this.adtitud;
  }

  public void setAdtitud(int adtitud) {
    this.adtitud = adtitud;
  }

  public Traje getTraje() {
    return this.traje;
  }

  public void setTraje(Traje traje) {
    this.traje = traje;
  }

  public Maquillaje getMaquillaje() {
    return this.maquillaje;
  }

  public void setMaquillaje(Maquillaje maquillaje) {
    this.maquillaje = maquillaje;
  }


  @Override
  public String toString() { return "Ninio: " +", adtitud=" + this.getAdtitud()+ "caramelos=" + this.caramelos ;
  }

  public int capacidadDeSusto() {

    int totalSusto, totalSusto1;
    totalSusto = this.traje.getSusto() + this.maquillaje.getSusto();
    totalSusto1 = this.adtitud * totalSusto;

    return totalSusto1;
  }

  


  public int intentarAsustar(Adulto adulto){

   return adulto.recibirSusto(1) ;
  }





  public void recibirCaramelos(int cantidad){ }

  public int comer(int cantidad)throws CaramelosInsuficientesException{
    if(this.caramelos < cantidad){
      throw new CaramelosInsuficientesException("La cantidad de caramelos que se posee es inferior a la demandada");
    } else
    {
      this.caramelos -= cantidad;
    }
    return cantidad;
  }







}
