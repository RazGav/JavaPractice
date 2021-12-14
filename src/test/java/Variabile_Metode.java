import org.junit.Test;

public class Variabile_Metode {

    //Clasa ,Variabila, Metoda, Constructor, Obiect.
    //1.Clasa este un sablon ce contine variabile, metode, constructori, obiecte.
    //2.Variabila este atributul unui clase.
    //3.Metoda reprezinta actiunile unei clase

    //1.Structura calsa = <access control> class <nume clasa> {}
    //Un fisier java cu o clasa
    //Numele clasei trebuie sa fie unic

    //2.Tipuri de variabile = global si local
    //Variabila globala este vizibila peste tot in clasa declarata
    //Structura variabila globala = <access control> <tip variabila> <nume variabila>;
    //O variabila poate sau nu sa primeasca o valoare
    //Structura variabila locala = <tip variabila> <nume variabia>;

    //3.Tipuri metode = void, return
    //In Java exista doar metode (declarate in interiorul unei clase) nu si functii
    //Metodele pot avea sau nu parametrii
    //Structura metoda void = <access control> void <nume metoda>(){}
    //Structura metoda return: <access control> <tipul de returnare> <nume>(){return}



    //Exemplu: Declaram variabile in interiorul clasei
    public String nume; //Sir de caractere
    public String prenume;
    public Integer varsta;  //Numere
    public Double inaltime; //Numere neintregi
    public String adresa;
    public Boolean esteAngajat; //true sau false
    public Double greutate;

    @Test
    public void atribuiValori(){
        nume = "Boros";
        prenume = "Madalina";
        varsta = 26;
        inaltime = 1.69;
        adresa = "Aurel Vlaicu nr. 36";
        esteAngajat = false;
        greutate = 69.30;

        System.out.print("Nume:" + nume + " ");
        System.out.print("Prenume:" + prenume + " ");
        System.out.println("Angajare:" + esteAngajat);

        System.out.println("Varsta:" + varsta + " Inaltime:" + inaltime + " Adresa:" + adresa);

        System.out.println(nume); //prinln incheie randul


        //Afisati pe tastatura mesajul: "Cursantul <nume> <prenume> a trimis proiectul la manual."
        System.out.println("Cursantul " + nume + " " + prenume + " " + "a trimis proiectul la manual.");
        System.out.println(String.format("%.2f", greutate)); //"%.xf" x-cate zecimale sa apara dupa virgula.

        System.out.println(getSalarAngajat());
    }

    //Returnam salarul unui angajat
    public Double getSalarAngajat(){
        Double salar = 2323.4;
        Double bonus = 2131.3;
        return salar + bonus;
    }
}