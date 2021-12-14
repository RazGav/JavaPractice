package Polimorfism;

import org.junit.Test;

public class Polimorfism_test {
    @Test
    public void testAutomat(){

        Student_FF Alex = new Student_FF("Dorha", "Alex", "Cluj, Fabricii");
        Alex.afiseazaInfoStudent();
        Alex.afiseazaInfoInitial();
        Alex.mediaStudentului(5, 8);
        Alex.mediaStudentului(4, 9, 10);

        Student_CF Vlad = new Student_CF("Domine", "Vlad-Calin", "Cluj, Brancusi");
        Vlad.afiseazaInfoStudent();
        Vlad.afiseazaInfoInitial();
        Vlad.mediaStudentului(7, 8);
        Vlad.mediaStudentului(6, 9, 10);
    }
}
