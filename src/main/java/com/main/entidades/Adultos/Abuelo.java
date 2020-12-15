package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public class Abuelo extends com.main.entidades.Adultos.Adulto {


  private int tolerancia;

  public Abuelo(int tolerancia) {
    super(tolerancia);
  }

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
  public int recibirSusto(Ninio ninios) {

    if (ninios.capacidadDeSusto() > (tolerancia))
      return tolerancia = ninios.getCaramelos() / 3;
    else
      return 0;

  }



}
