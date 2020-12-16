package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public class Abuelo extends com.main.entidades.Adultos.Adulto {


  private int tolerancia;

  public Abuelo() {
  }


  public int getTolerancia() {
    return this.tolerancia;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
  public int recibirSusto(Ninio ninios) {

    return tolerancia = ninios.getCaramelos() / 2;


  }



}
