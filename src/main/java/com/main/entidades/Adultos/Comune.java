package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;
import sun.font.TrueTypeFont;

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
  public boolean recibirSusto(int fueAsustado) {
     Ninio ninio = new Ninio();
     if (ninio.capacidadDeSusto() > this.tolerancia)
       tolerancia = ninio.getCaramelos()/2;
      return true;

    }
}
