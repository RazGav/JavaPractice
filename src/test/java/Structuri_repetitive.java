import org.junit.Test;

public class Structuri_repetitive {

    //Cele mai intalnite structuri repetitive sunt for si while

    @Test
    public void testautomat(){
        //numere();
        //numerew();
        afisamNumereFor(22);
    }

    //Afisam primele 50 de numere
    public void numere(){
        for(Integer i = 1; i <= 50; i++)
            System.out.print(i + " ");
    }

    public void numerew(){
        Integer i = 1;
        while (i <= 50){
            System.out.print(i + " ");
            i++;
        }
    }

    //De Alex
    public void afisamNumereFor(Integer limit){
        for(Integer index=1; index <= limit; index=index+1){
            System.out.print(index + " ");
        }
    }

    public void afisamNumereWhile(Integer limit){
        Integer index = 1;
        while(index <= limit){
            index++;
            System.out.print(index + " ");
        }
    }
}