package com.main;

import com.main.entidades.Adultos.Abuelo;
import com.main.entidades.Adultos.Comune;
import com.main.entidades.Adultos.Necio;
import com.main.entidades.Ninios.*;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws CaramelosInsuficientesException {
    Terrorifico jason = new Terrorifico();
    Tierno winniepoh = new Tierno();
    Tierno sullivan = new Tierno();
    Terrorifico gerogebush = new Terrorifico();
    Maquillaje maquillaje1 = new Maquillaje();

    Ninio niños1 = new Ninio("Bobby",4,gerogebush,maquillaje1,10);
    Ninio niños2 = new Ninio("Richie",3,sullivan,maquillaje1,10);
    Ninio niños3 = new Ninio("Scott",2,jason,maquillaje1,10);
    Ninio niños4 = new Ninio("Bill",3,winniepoh,maquillaje1,10);
    Abuelo abuelos = new Abuelo();
    Abuelo abuelos1 = new Abuelo();
    Abuelo abuelos2 = new Abuelo();
    Comune comunes = new Comune();
    Necio necios = new Necio();


    niños1.intentarAsustar(comunes);
    niños1.intentarAsustar(abuelos);
    niños1.intentarAsustar(necios);
    System.out.println("La Capacidad de Asustar Del Niño es: " + niños1.capacidadDeSusto());
    System.out.println("El Niño come:  " + niños1.comer(0) + " Caramelos");



    ArrayList<Ninio> miembros = new ArrayList<>();


    miembros.add(new Ninio("Bobby",2, jason, maquillaje1, 10));
    miembros.add(new Ninio("Richie",2, winniepoh, maquillaje1, 10));
    miembros.add(new Ninio("Bill",3, sullivan, maquillaje1, 10));
    miembros.add(new Ninio("Scott",4, gerogebush, maquillaje1, 10));

    Legion legion= new Legion(miembros);
    try {
      legion.reportar();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    legion.intentarAsustarA(comunes);
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    legion.intentarAsustarA(abuelos);
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    legion.intentarAsustarA(abuelos1);
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    legion.intentarAsustarA(abuelos2);
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    legion.intentarAsustarA(necios);
    System.out.println(" EL lider Tiene " + legion.getLider().getCaramelos() + " caramelos ");
    System.out.println(" cantidad de sustos registrados =  " + legion.sustosTotalesDados());

  }

}
