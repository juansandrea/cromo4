package com.main.entidades.Adultos;


public class Necio extends Adulto {


  private int tolerancia;

  public Necio() {
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
    return 0;
  }
}
