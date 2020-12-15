package com.main.entidades.Adultos;

import com.main.entidades.Ninios.Ninio;

public class Comune extends com.main.entidades.Adultos.Adulto {



  private int tolerancia ;

    public Comune(int tolerancia) { super(tolerancia);

  }


  public Comune(){
      this.tolerancia = 30;
  }

  public int getTolerancia() {
    return this.tolerancia ;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
  public int recibirSusto(Ninio ninios) {
    if (ninios.capacidadDeSusto() > (tolerancia))
      return tolerancia = ninios.getCaramelos() / 2;
    else
      return 0;



}
}
