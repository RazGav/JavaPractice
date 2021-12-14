package Clasa_Abstracta;
import org.junit.Test;

public class Persoana_Abstract_test {

    @Test
    public void testAutomat(){
        Persoana_Student_Abstract student = new Persoana_Student_Abstract("Ala", "Bala", 23);
        student.invata();
        student.mergeLaCurs();

        Persoana_Angajat_Abstract angajat = new Persoana_Angajat_Abstract("Portocala", "Cine", 33);
        angajat.lucreaza();
        angajat.estePlatit();

        Persoana_Student_Angajat_Abstract duo = new Persoana_Student_Angajat_Abstract("Mi-a", "Furat", 22);
        duo.invata();
        duo.mergeLaCurs();
        duo.lucreaza();
        duo.estePlatit();

        duo.detaliiVarsta(22);
    }
}
