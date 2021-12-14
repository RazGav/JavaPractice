package Clasa_Abstracta;

public class Persoana_Student_Angajat_Abstract extends Persoana_Abstract{

    public String nume;
    public String prenume;
    public Integer varsata;

    public Persoana_Student_Angajat_Abstract(String nume, String prenume, Integer varsata) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsata = varsata;
    }

    public void infoPersoana(){
        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsata);
    }


    @Override
    public void invata() {
        System.out.println("Studentul " + nume + " " + prenume + " invata.");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Angajatul " + nume + " " + prenume + " munceste.");
    }

    @Override
    public void lucreaza() {
        System.out.println("Angajatul " + nume + " " + prenume + " munceste.");
    }

    @Override
    public void estePlatit() {
        System.out.println("Angajatul " + nume + " " + prenume + " este platit.");
    }
}
