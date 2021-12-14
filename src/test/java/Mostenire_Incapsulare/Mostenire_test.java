package Mostenire_Incapsulare;

import org.junit.Test;

import java.util.Arrays;

public class Mostenire_test {
    @Test
    public void testAutomat(){
        Audi Q5 = new Audi("Hatchback", 5,5,"MQB", 1.9,"manuala", "benzina",
                "Q5", Arrays.asList("Radio", "GPS", "Ceata"), 43224.43);
        Q5.configuratieMasina();

        Audi Q7 = new Audi("Brack", 5,3,"ABC", 2.3,"automata", "motorina",
                "Q7", Arrays.asList("Radio", "GPS"), 50002.423);
        Q7.configuratieMasina();

        Volkswagend Golf6 = new Volkswagend("Brack", 4, 5, "ABCD", 1.6, "manuala", "motorina", "Germania", 21000.0, Arrays.asList("Scaune incalzite", "Ceata"), "Golf 6");
        Golf6.configuratieMasina();
        Golf6.afiseazaOrigine();
        //Variabilele se fac private si iau cu get (incapsulare(private))
        Golf6.setModel("Golf7");
        Golf6.configuratieMasina();
    }
}
