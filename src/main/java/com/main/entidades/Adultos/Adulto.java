package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public abstract class Adulto {
  public Adulto(int tolerancia) {
    this.tolerancia = tolerancia;
  }
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


  public abstract int recibirSusto(Ninio ninio);

}
