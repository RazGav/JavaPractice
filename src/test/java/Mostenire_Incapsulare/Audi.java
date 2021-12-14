package Mostenire_Incapsulare;

import java.util.List;

public class Audi extends Masina {   //extends creeaza mostenirea
    private String model;
    private List<String> dotari;
    private Double pret;


    public Audi(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie, String combustibil, String model, List<String> dotari, Double pret) {      //contructor de la Masina
        super(caroserie, roti, usi, sasiu, motorizare, transmisie, combustibil);        //constructor de la Audi
        this.model = model;
        this.dotari = dotari;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void configuratieMasina(){
        System.out.println("Masina Audi cu modelul " + getModel() + " are urmatoare configuratie: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + getModel() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", caroserie='" + getCaroserie() + '\'' +
                ", roti=" + getRoti() +
                ", usi='" + getUsi() + '\'' +
                ", sasiu='" + getSasiu() + '\'' +
                ", motorizare=" + getMotorizare() +
                ", transmisie='" + getTransmisie() + '\'' +
                ", combustibil='" + getCombustibil() + '\'' +
                '}';
    }
}
