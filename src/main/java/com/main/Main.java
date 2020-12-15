package com.main;

import com.main.entidades.Adultos.Abuelo;
import com.main.entidades.Adultos.Comune;
import com.main.entidades.Ninios.*;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws CaramelosInsuficientesException {
    Terrorifico jason = new Terrorifico();
    Tierno winniepoh = new Tierno();
    Tierno sullivan = new Tierno();
    Terrorifico gerogebush = new Terrorifico();
    Maquillaje maquillaje1 = new Maquillaje();

    Ninio niños1 = new Ninio(5,winniepoh,maquillaje1,5);
    Ninio niños2 = new Ninio(2,jason,maquillaje1,6);
    Abuelo abuelos = new Abuelo();
    Comune comunes = new Comune();
    System.out.println("La Capacidad de Asustar Del Niño es: " + niños1.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños1.intentarAsustar(abuelos));
    System.out.println("El Niño come:  " + niños1.comer(5) + " Caramelos");

    System.out.println("===============================================================================");

    System.out.println("La Capacidad de Asustar Del Niño es: " + niños2.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños2.intentarAsustar(comunes));
    System.out.println("El Niño come:  " + niños2.comer(9) + " Caramelos");

    ArrayList<Legion> miembros = new ArrayList<>();

    miembros.add(new Legion("Bobby", 5, jason, maquillaje1, 10));
    miembros.add(new Legion("Richie", 3, winniepoh, maquillaje1, 13));
    miembros.add(new Legion("Bill", 5, sullivan, maquillaje1, 11));
    miembros.add(new Legion("Scott", 9, gerogebush, maquillaje1, 14));

    Legion legion = new Legion();
    legion.elegirLider(miembros);
    System.out.println("\n");




  }
}
