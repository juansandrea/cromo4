package com.main.entidades.Adultos;



public abstract class Adulto {

  private int tolerancia ;

  @Override
  public String toString() {
    return "Adulto{" +  "tolerancia=" + tolerancia + '}';
  }

  public Adulto() {

  }

  public int getTolerancia() {
    return this.tolerancia;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }


  public abstract int recibirSusto(int fueAsustado);

}
