package Abstractizare_interfata;

public class Persoana_Student_Interface extends Persoana_Interface implements IStudent{

    public Persoana_Student_Interface(String nume, String prenume, Integer varsata) {
        super(nume, prenume, varsata);
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
