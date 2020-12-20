package com.main.entidades.Adultos;


public class Comune extends com.main.entidades.Adultos.Adulto {



  private int tolerancia ;

    public Comune() {
      this.tolerancia = 20;

  }

  public int getTolerancia() {
    return this.tolerancia ;
  }

  public void setTolerancia(int tolerancia) {
    this.tolerancia = tolerancia;
  }

  @Override
    public int recibirSusto(int fueAsustado) {
       if (fueAsustado > tolerancia) {
         return tolerancia / 2;
       } else {
         return 0;
       }
    }
}
