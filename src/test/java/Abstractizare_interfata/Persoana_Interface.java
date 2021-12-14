package Abstractizare_interfata;

public class Persoana_Interface {

    //Abstractizare = conceptul prin care definim comportamentul unei clase
    //Abstractizarea se poate realiza cu interfete sau clase abstracte
    //Se foloseste cuvantul cheie "interface"
    //O clasa implementeaza o interfata
    //O clasa poate implementa mai multe interfete
    //O interfata contine doar metode abstracte(metode definite care nu au implementare)
    //Nu avem constructor intr-o interfata => nu putem crea obiecte
    //Clasa care implementeaza interfata implementeaza toate metodele din interfata

    public String nume;
    public String prenume;
    public Integer varsata;

    public Persoana_Interface(String nume, String prenume, Integer varsata) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsata = varsata;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsata);
    }
}
