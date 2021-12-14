package Obiect;

import org.junit.Test;

import java.util.Arrays;

public class Cursant_test {

    @Test
    public void testAutomat(){
        //Declaram un obiect de tipul cursant
        System.out.println("--- Obiectul Razvan ---");
        Cursant Razvan = new Cursant("Gavris", "Razvan", 23, 5000.0, false, Arrays.asList("Testing", "Developer", "Business"));
        Razvan.prenume = "Patrick";
        Razvan.dateCursantCursuri();
        Razvan.verificaVarstaCursant();

        System.out.println("--- Obiectul Gabriela ---");
        Cursant Gabriela = new Cursant("Salajan", "Gabriela", 17, 5000.0, false, "Auto");
        Gabriela.dateCursantCurs();
        Gabriela.verificaVarstaCursant();

        System.out.println("--- Obiectul Alab ---");
        Cursant Alab = new Cursant("Delo", "Saleb", 78, false, Arrays.asList("Adw", "deunf"));
        Alab.dateCursantCursuri();
        Alab.verificaVarstaCursant();
    }

}
