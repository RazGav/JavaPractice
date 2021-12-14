package Protected;

public class Voluntar {

    //protected = vizibil in clasa parinte + clasa copil chiar daca se afla in pachete diferite
    //protected = vizibil in momentul in care declaram un obiect intr-o alta clasa(din acelasi pachet)
    //protected = nu e vizibil in momentul in care declaram un obiect intr-o alta clasa(dintr-un pachet diferit)

    //default = vizibil in clasa parinte + clasa copil daca se afla in acelasi pachet
    //default = vizibil in momentul in care declaram un obiect intr-o alta clasa(din acelasi pachet)
    //default = nu e vizibil in momentul in care declaram un obiect intr-o alta clasa(dintr-un pachet diferit)


    public String nume;
    public String prenume;

    public Voluntar(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void metodaPublica(){
        System.out.println("Public");
    }

    private void metodaPrivata(){
        System.out.println("Private");
    }

    protected void metodaProtected(){
        System.out.println("Protected");
    }

    void metodaDefault(){
        System.out.println("Default");
    }
}
