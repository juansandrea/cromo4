package com.main.entidades.Ninios;

import com.main.interfaces.Disfrace;

public class Maquillaje implements Disfrace {

  private int susto ;

  public int getSusto() {
    return this.susto;
  }

  public void setSusto(int susto) {
    this.susto = susto;
  }

  public Maquillaje() {
    this.susto = 3;
  }

  @Override
  public int getsusto() {
    return this.susto;
  }
}
