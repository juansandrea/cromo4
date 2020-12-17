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
  public int recibirSusto(Ninio ninio,boolean fueAsustado) {
      fueAsustado = true;
    if (ninio.capacidadDeSusto() > this.tolerancia)
      return this.tolerancia / 2;
    else
      return 0;



}
}
