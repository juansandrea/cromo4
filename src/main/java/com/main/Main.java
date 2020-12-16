package com.main;

import com.main.entidades.Adultos.Abuelo;
import com.main.entidades.Adultos.Comune;
import com.main.entidades.Adultos.Necio;
import com.main.entidades.Ninios.*;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws CaramelosInsuficientesException {
    Terrorifico jason = new Terrorifico();
    Tierno winniepoh = new Tierno();
    Tierno sullivan = new Tierno();
    Terrorifico gerogebush = new Terrorifico();
    Maquillaje maquillaje1 = new Maquillaje();

    Ninio niños1 = new Ninio("Bobby",20,9,gerogebush,maquillaje1,10);
    Ninio niños2 = new Ninio("Richie",20,5,sullivan,maquillaje1,10);
    Ninio niños3 = new Ninio("Scott",20,5,jason,maquillaje1,10);
    Ninio niños4 = new Ninio("Bill",20,5,winniepoh,maquillaje1,10);
    Abuelo abuelos = new Abuelo();
    Comune comunes = new Comune();
    Necio necios = new Necio();



    System.out.println("La Capacidad de Asustar Del Niño es: " + niños1.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños1.intentarAsustar(abuelos));
    System.out.println("El Niño come:  " + niños1.comer(0) + " Caramelos");

    System.out.println("===============================================================================");

    System.out.println("La Capacidad de Asustar Del Niño es: " + niños2.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños2.intentarAsustar(comunes));
    System.out.println("El Niño come:  " + niños1.comer(0) + " Caramelos");

    System.out.println("===============================================================================");

    System.out.println("La Capacidad de Asustar Del Niño es: " + niños3.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños3.intentarAsustar(necios));
    System.out.println("El Niño come:  " + niños1.comer(0) + " Caramelos");

    System.out.println("===============================================================================");

    System.out.println("La Capacidad de Asustar Del Niño es: " + niños4.capacidadDeSusto());
    System.out.println("La cantidad de Caramelos que tiene el niño: " + niños4.intentarAsustar(comunes));
    System.out.println("El Niño come:  " + niños2.comer(0) + " Caramelos");

    ArrayList<Ninio> miembros = new ArrayList<>();


    miembros.add(new Ninio("Bobby", 40,5, jason, maquillaje1, 1));
    miembros.add(new Ninio("Richie", 15,3, winniepoh, maquillaje1, 1));
    miembros.add(new Ninio("Bill", 25,5, sullivan, maquillaje1, 1));
    miembros.add(new Ninio("Scott", 72,9, gerogebush, maquillaje1, 1));

    Legion legion= new Legion();
    legion.elegirLider(miembros);
    niños1.intentarAsustarA(comunes);
    legion.reportar();

    System.out.println("\n");
    System.out.println("legion Asusta " + comunes);






  }
}
