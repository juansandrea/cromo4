package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public class Comune extends com.main.entidades.Adultos.Adulto {



  private int tolerancia ;

    public Comune() {

  }

  public int getTolerancia() {
    return this.tolerancia ;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
  public int recibirSusto(Ninio ninios) {
    if (ninios.capacidadDeSusto() > this.tolerancia)
      return this.tolerancia + ninios.getCaramelos() / 2;
    else
      return 0;



}
}
