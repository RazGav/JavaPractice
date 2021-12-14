import org.junit.Test;

public class Structuri_alternative {

    //Cele mai intalnite sunt structuri alternative si repetitive
    //1.Structura alternativa = if(<conditie>) {}
    //                                         else {}

    @Test
    public void testautomat(){
        verificarenumere();
        verifcamsir();
        verificaparitate(-5);
        verificaparitate(14);
        verificaparitate(-8);
        verificaparitate(7);
        afiseazaZiuaInCurs("Luni");
    }

    //Verificam daca 5 > 3
    public void verificarenumere(){
        if(2 > 3){
            System.out.println("Primul numar este mai mare decat 3");
        }
        else {
            System.out.println("Primul numar nu este mai mare decat 3");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verifcamsir(){
        String nume = "Alexandru";
        String contine = "Altex";

        if(nume.contains(contine)){
            System.out.println("Alex este inclus in Alexandru");
        }
        else {
            System.out.println("Numele nu este inclus in Alexandru");
        }
    }

    //Verificam daca un nunar este par sau impar / pozitiv sau negativ
    public void verificaparitate(Integer numar){
        if(numar % 2 == 0){
            System.out.println("Numarul " + numar + " este par");
        }
        if (numar % 2 == 1 | numar % 2 == -1){
            System.out.println("Numarul " + numar + " este impar");
        }
        if (numar >= 0){
            System.out.println("Numarul " + numar + " este pozitiv");
        }
        if (numar < 0){
            System.out.println("Numarul " + numar + " este negativ");
        }
    }

    //Afisam in consola ziua de astazi
    //Case nu poate folosi conditii
    public void afiseazaZiuaInCurs(String ziua){
        switch (ziua){
            case "Duminica":
                System.out.println("Astazi e Duminica");
                break;
            case "Luni":
                System.out.println("Astazi e Luni");
                break;
            case "Marti":
                System.out.println("Astazi e Marti");
                break;
            case "Miercuri":
                System.out.println("Astazi e Miercuri");
                break;
            case "Joi":
                System.out.println("Astazi e Joi");
                break;
            case "Vineri":
                System.out.println("Astazi e Vineri");
                break;
            case "Sambata":
                System.out.println("Astazi e Sambata");
                break;
        }
    }
}
