import static java.lang.Math.log;

public class Rampa {
    private Lopticka lopticka;

    Rampa(Lopticka lopticka)
    {
        this.lopticka=lopticka;
} public int pocetOdrazov(float vyska){

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


