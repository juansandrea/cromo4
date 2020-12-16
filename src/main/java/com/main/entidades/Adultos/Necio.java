package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public class Necio extends Adulto {


  private int tolerancia;

  public Necio() {

  }


    public int getTolerancia() {
    return this.tolerancia;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
  public int recibirSusto(Ninio ninios) {
    return 0;
  }
}
