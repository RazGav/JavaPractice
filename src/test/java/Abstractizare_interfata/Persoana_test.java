package Abstractizare_interfata;

import org.junit.Test;

public class Persoana_test {
    @Test
    public void testAutomat(){
        Persoana_Student_Interface student = new Persoana_Student_Interface("Ala", "Bala", 23);
        student.invata();
        student.mergeLaCurs();

        Persoana_Angajat_Interface angajat = new Persoana_Angajat_Interface("Portocala", "Cine", 33);
        angajat.munceste();
        angajat.primesteSalar();

        Persoana_Student_Angajat_Interface duo = new Persoana_Student_Angajat_Interface("Mi-a", "Furat", 22);
        duo.invata();
        duo.mergeLaCurs();
        duo.munceste();
        duo.primesteSalar();
    }
}
