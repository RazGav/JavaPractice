package Mostenire_Incapsulare;

public class Masina {

    //Oop mostenire
    //Conceptul prin care o clasa mosteneste o alta clasa
    //Clasa de baza <parinte> = Masina
    //Clasa <copil> = Audi
    //Mostenirea se face cu "extends"
    //In java putem mosteni o singura clasa
    //In momentul in care mostenim o clasa => mostenim tot ce contine clasa

    //Access control: private = disponibil doar in clasa in care este declarat
    //Incapsulare = conceptul prin care excludem atributele de tot ce ne inconjoara


    private String caroserie;
    private Integer roti;
    private Integer usi;
    private String sasiu;
    private Double motorizare;
    private String transmisie;
    private String combustibil;

    public Masina(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie, String combustibil) {
        this.caroserie = caroserie;
        this.roti = roti;
        this.usi = usi;
        this.sasiu = sasiu;
        this.motorizare = motorizare;
        this.transmisie = transmisie;
        this.combustibil = combustibil;
    }

    public String getCaroserie() {
        return caroserie;
    }

    public void setCaroserie(String caroserie) {
        this.caroserie = caroserie;
    }

    public Integer getRoti() {
        return roti;
    }

    public void setRoti(Integer roti) {
        this.roti = roti;
    }

    public Integer getUsi() {
        return usi;
    }

    public void setUsi(Integer usi) {
        this.usi = usi;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public Double getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Double motorizare) {
        this.motorizare = motorizare;
    }

    public String getTransmisie() {
        return transmisie;
    }

    public void setTransmisie(String transmisie) {
        this.transmisie = transmisie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }
}
