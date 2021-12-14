package Polimorfism;

import java.sql.SQLOutput;

public class Student {
    //Polimorfism = este de doua feluri:
    //1.Dinamic/Overriding = Intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //2.Static/Overloading = Conceptul prin care putem avea mai multe metode cu acelasi nume si diferentierea se face prin
    //                       numarul de parametrii sau tipul de parametrii

    private String nume;
    private String prenume;
    private String adresa;

    public Student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    //Polimorfism dinamic
    public void afiseazaInfoStudent(){
        System.out.println("Detaliile despre student sunt: " + getNume() + " " + getPrenume() + " " + getAdresa());
    }




    //Daca metodele difera doar prin return nu e polimorfism si da eroare. Polimorfismul apare doar la void

    // public String test(){
    //     String nume = "Alex";
    //     return nume;
    // }
    // public String test() {
    //     return 1;
    // }
}
