package Access_Control;

import Protected.Voluntar;

public class Piezisa extends Voluntar {

    public Piezisa(String nume, String prenume) {
        super(nume, prenume);
    }

    public void metodaHabarNam(){
        metodaPublica();
        metodaProtected();
    }
}
