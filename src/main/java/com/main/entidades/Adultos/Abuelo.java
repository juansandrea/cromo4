package com.main.entidades.Adultos;


public class Abuelo extends com.main.entidades.Adultos.Adulto {


  private int tolerancia;

  public Abuelo() {
    this.tolerancia = 20;
  }


  public int getTolerancia() {
    return this.tolerancia;

  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
  public int recibirSusto(int fueAsustado) {

    return tolerancia / 4;
  }



}
