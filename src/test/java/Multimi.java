import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    @Test
    public void testautomat(){
        System.out.println("1.Array cu numere");
        printeazaArrayNumere();
        System.out.println("2.Array cu siruri");
        printeazaArrayString();
        System.out.println("3.Lista cu siruri");
        printeazaListaValori();
        System.out.println("4.HashMap cu siruri");
        printeazaHashMapValori();
        System.out.println("5.Afisarea oraselor care de anumite tari");
        printeazaListaOrase();
    }

    public void printeazaArrayNumere(){
        Integer[] arrayNumere = new Integer[4]; // paranteze drepte = array
        arrayNumere[0] = 4;
        arrayNumere[1] = 5;
        arrayNumere[2] = 6;
        arrayNumere[3] = 7;
        for(int i = 0; i < arrayNumere.length; i++){
            System.out.println("Numarul curent din array este: " + arrayNumere[i]);
        }
        System.out.println("Ultimul numar din array este: " + arrayNumere[arrayNumere.length-1]);
    }

    //Integer referinta,
    public void printeazaArrayString(){
        String[] arraySiruri = new String[4];
        arraySiruri[0] = "Radu";
        arraySiruri[1] = "Maria";
        arraySiruri[2] = "Marian";
        for(int i = 0; i < arraySiruri.length-1; i++){
            System.out.println("Numele curent este " + arraySiruri[i]);
        }
    }

    public void printeazaListaValori(){
        List<String> ListaValori = new ArrayList<>(); //Se declara lista
        ListaValori.add("Radu");
        ListaValori.add("Maria");
        ListaValori.add("Marian");
        for(int i = 0; i < ListaValori.size(); i++){
            System.out.println("Numele curent este " + ListaValori.get(i));
        }
    }

    public void printeazaHashMapValori(){
        //HashMap functioneaza dupa logica de key = value (o valoare e stocata in interiorul unei key)
        HashMap<String, String> mapValori = new HashMap<>();
        mapValori.put("nume", "Gavris");
        mapValori.put("prenume1", "Razvan");
        mapValori.put("prenume2", "Andrei");
        for(String key: mapValori.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + mapValori.get(key));
        }
    }

    public void printeazaListaOrase(){
        List<String> ListaOraseRomania = new ArrayList<>();
        ListaOraseRomania.add("Bucuresti");
        ListaOraseRomania.add("Cluj-Napoca");
        ListaOraseRomania.add("Dej");
        ListaOraseRomania.add("Oradea");

        List<String> ListaOraseSpania = new ArrayList<>();
        ListaOraseSpania.add("Madrid");
        ListaOraseSpania.add("Barcelona");
        ListaOraseSpania.add("Valencia");

        List<String> ListaOraseItalia = new ArrayList<>();
        ListaOraseItalia.add("Roma");
        ListaOraseItalia.add("Napoli");
        ListaOraseItalia.add("Sorento");

        HashMap<String, List<String>> mapTari = new HashMap<>();
        mapTari.put("Romania", ListaOraseRomania);
        mapTari.put("Spania", ListaOraseSpania);
        mapTari.put("Italia", ListaOraseItalia);

        for(String key: mapTari.keySet()){
            System.out.println("Orasele care apartin de tara " + key + " sunt urmatoarele: " + mapTari.get(key));
            List<String> orase = mapTari.get(key);
            for(int i = 0; i < orase.size(); i++){
                System.out.println("Unul dintre orasele din romania este " + orase.get(i));
            }
        }
    }
}

