package sk.euba.fhi.tajj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class rampaTest {
    @Test
    public void otestuPocetodrazov()
    {
        Lopticka lopticka = new Lopticka( 0.83F);
Rampa rampa = new Rampa(lopticka);
int pocetOdrazov =rampa.pocetOdrazov(2);
int ocakavanzyPocetOdrazov=3;
        Assertions.assertEquals(ocakavanzyPocetOdrazov,pocetOdrazov);



    }



}
