package com.main.entidades.Ninios;

import com.main.interfaces.Disfrace;

public class Traje implements Disfrace {

  private int susto;

  public Traje() {
  }

  public int getSusto() {
    return this.susto;
  }

  public void setSusto(int susto) {
    this.susto = susto;
  }

  @Override
  public int getsusto() {
    return susto;
  }
}
