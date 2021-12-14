package Protected;

public class Teatru {
    public void habarNamDoi(){
        Voluntar Ghita = new Voluntar("Gherars", "Alber");
        Ghita.metodaPublica();
        Ghita.metodaDefault();
        Ghita.metodaProtected();
    }
}
