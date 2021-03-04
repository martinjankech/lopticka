package sk.euba.fhi.tajj;

import static java.lang.Math.log;

public class Rampa {
    private Lopticka lopticka;

    Rampa(Lopticka lopticka)
    {this.lopticka=lopticka;


    }

    public void zhodLopticku(float vyska) {
int pocetOdrazov=pocetOdrazov(vyska);
System.out.println("Pocet odrazov je" +pocetOdrazov);

        vypisOdrazy(vyska);

    }

    private void vypisOdrazy(float vyska) {
        for (int x=0 ; x <= 10; x++)
        {
            //cout.width(2);
            System.out.print(x+":");
            //cout.precision(3);
            if (vyska < 1)
                System.out.println(vyska*100 +"cm");
            else
                System.out.println(vyska+"m");
            vyska *= this.lopticka.getKoeficient();
        }
    }

    public int pocetOdrazov(float vyska){

       int pocetOdrazov= ((int)(log(1.0/vyska) / log(lopticka.getKoeficient())));
        /*
        int i;
        float v2 = vyska;
        for (i = 0; v2 > 1; i++) {
            v2 *= this.lopticka.getKoeficient();
        }
        System.out.println(i - 1);
        */
        return pocetOdrazov;

    }
}
