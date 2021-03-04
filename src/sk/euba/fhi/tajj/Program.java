package sk.euba.fhi.tajj;

import java.util.Scanner;

import static java.lang.Math.log;

public class Program {


    public void vypisUlohy(){
        float vyska = nacitaVstup();
        float koeficient = nacitaVstup();
        Lopticka lopticka=new Lopticka(koeficient);
        Rampa rampa= new Rampa(lopticka);
        rampa.zhodLopticku(vyska);



        // alternativny vypocet poctu vyskokov lopticky vacsich ako 1 m pomocou cyklu



    }

    private float nacitaVstup() {
        float vstup;
        Scanner in = new Scanner(System.in);
        vstup=in.nextFloat();

        return vstup;
    }

}

