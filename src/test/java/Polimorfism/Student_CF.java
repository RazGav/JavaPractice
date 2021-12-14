package Polimorfism;

public class Student_CF extends Student{

    public Student_CF(String nume, String prenume, String adresa) {
        super(nume, prenume, adresa); //super apeleaza constructorul din parinte

    }

    public void mediaStudentului(Integer nota1, Integer nota2){
        Integer medie = (nota1 + nota2) / 2;
        System.out.println("Media studentului CF este: " + medie);
    }

    public void mediaStudentului(Integer nota1, Integer nota2, Integer nota3){
        Integer medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului CF este: " + medie);
    }

    public void afiseazaInfoInitial(){
        super.afiseazaInfoStudent();
    }

    @Override
    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre student CF sunt: " + getNume() + " " + getPrenume() + " " + getAdresa());
    }

}
