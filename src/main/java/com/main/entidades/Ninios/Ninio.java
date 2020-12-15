package com.main.entidades.Ninios;

import com.main.entidades.Adultos.Adulto;

import java.util.ArrayList;


public class Ninio {

  private int caramelos;
  private int adtitud;
  private Traje traje;
  private Maquillaje maquillaje;

  public Ninio(int adtitud, Traje traje, Maquillaje maquillaje,int caramelos) {
    this.adtitud = adtitud;
    this.traje = traje;
    this.maquillaje = maquillaje;
    this.caramelos = caramelos;
  }

  public Ninio() {

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
  public String toString() {
    return "Ninio{" + ", adtitud=" + adtitud + ", traje=" + traje + ", maquillaje=" + maquillaje + '}';
  }

  public int capacidadDeSusto() {

    int totalSusto, totalSusto1;
    totalSusto = this.traje.getSusto() + this.maquillaje.getSusto();
    totalSusto1 = this.adtitud;

    return totalSusto * totalSusto1;
  }

  


  public int intentarAsustar(Adulto adulto){

    this.caramelos += this.caramelos + adulto.recibirSusto(this);

    return caramelos;
  }


  public int comer(int cantidad)throws CaramelosInsuficientesException{
    if(this.caramelos < cantidad){
      throw new CaramelosInsuficientesException("La cantidad de caramelos que se posee es inferior a la demandada");
    } else
    {
      this.caramelos -= cantidad;
    }
    return cantidad;
  }



  public void elegirLider(ArrayList<Legion> miembros){
    Legion elegirLider = null;

    int mayorAdtitud = 9;
    for (Legion lider : miembros){
      if (lider.getAdtitud() >= mayorAdtitud){
        mayorAdtitud = lider.getAdtitud();
        elegirLider = lider;
      }
    }

    System.out.println("El lider es = " + elegirLider.getNombre());



  }



}
