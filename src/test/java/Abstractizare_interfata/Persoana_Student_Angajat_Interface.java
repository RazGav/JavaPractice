package Abstractizare_interfata;

public class Persoana_Student_Angajat_Interface extends Persoana_Interface implements IStudent, IAngajat{

    public Persoana_Student_Angajat_Interface(String nume, String prenume, Integer varsata) {
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

    @Override
    public void invata() {
        System.out.println("Studentul " + nume + " " + prenume + " invata.");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul " + nume + " " + prenume + " merge la curs.");
    }
}
