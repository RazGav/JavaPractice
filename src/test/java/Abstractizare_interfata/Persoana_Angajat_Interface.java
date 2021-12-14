package Abstractizare_interfata;

public class Persoana_Angajat_Interface extends Persoana_Interface implements IAngajat{


    public Persoana_Angajat_Interface(String nume, String prenume, Integer varsata) {
        super(nume, prenume, varsata);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul " + nume + " " + prenume + " munceste.");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul " + nume + " " + prenume + " este platit.");
    }
}
