package Clasa_Abstracta;

public abstract class Persoana_Abstract {

    //O clasa abstracta poate sau nu sa contina metode abstracte
    //Clasa care extinde o clasa abstracta trebuie sa implementeze toate metodele abstracte
    //Intr-o clasa abstracta poti sa declari un constructor insa nu poti face un obiect dintr-o clasa abstracta
    //Putem mosteni o singura clasa
    //O clasa abstracta poate sa implementa una sau mai multe interfete insa o interfata nu poate sa extinda o clasa abstracta
    //O interfata poate sa extinda o alta interfata
    //O clasa abstracta poate sa extinda o alta clasa abstracta


    public abstract void invata();
    public abstract void mergeLaCurs();
    public abstract void lucreaza();
    public abstract void estePlatit();

    public void detaliiVarsta(int varsta){
        if(varsta > 18){
            System.out.println("Persoana e majora");
        }
    }



}
