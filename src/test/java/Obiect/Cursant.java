package Obiect;

import java.util.List;

public class Cursant {

    //Obiect = instanta unui clase
    //Dintr-o clasa putem declara n obiecte
    //Ca sa initializam un obiect folosim cuvantul cheie "new"
    //Structura obiect = <nume clasa> <nume obiect> = new <nume clasa>(se va apela contstructorul clasei)(se vor da valori pentru variabile daca exista)
    //ex: cursant Razvan = new cursant ()

    //Constructor = are ca rol initializarea atributelor unei clase
    //Intr-o clasa putem defini n contructori diferentiati prin parametrii sau numar de parametrii
    //Contrusctorii dintr-o clasa trebuie sa fie publici
    //Structura contructori = public <numele clasei>(<definim parametrii daca avem nevoie>){}
    //In cazul in care nu declaram un constructor => este pus unul by default (contructor implicit)
    //this = trimite catre variabila din interiorul clasei(se aplica doar daca avem 2 variabile cu acelasi nume)

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Boolean esteAngajat;
    public List<String> cursuri;
    public String curs;

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Boolean esteAngajat, List<String> cursuri){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.esteAngajat = esteAngajat;
        this.cursuri = cursuri;
    }

    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, List<String> cursuri){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.esteAngajat = esteAngajat;
        this.cursuri = cursuri;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Boolean esteAngajat, String curs){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.esteAngajat = esteAngajat;
        this.curs = curs;
    }

    public void dateCursantCursuri(){
        System.out.println("Numele cursantului este " + nume + " " + prenume + ", " + varsta + " ani" + ", avand de platit " + taxa + " lei.");
        System.out.println("Angajare: " + esteAngajat);
        System.out.println("Participa la cursurile: ");
        for(String curs: cursuri) {
            System.out.print(curs + "; ");
        }
    }

    public void dateCursantCurs(){
        System.out.println("Numele cursantului este " + nume + " " + prenume + ", " + varsta + " ani" + ", avand de platit " + taxa + " lei.");
        System.out.println("Angajare: " + esteAngajat);
        System.out.println("Participa la cursul: " + curs);
    }

    public void verificaVarstaCursant(){
        System.out.println();
        if(varsta >= 18 & varsta < 65){
            System.out.println("Cursantul este major");
        }
        else if(varsta < 18){
            System.out.println("Cursantul este minor");
        }
        else {
            System.out.println("Cursantul este pensionar");
        }
    }
}