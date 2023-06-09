import org.testng.annotations.Test;

import java.util.Random;

public class PetleWhileDoWhile {
    @Test
    public void whileExample() {

        int silniazpierdolnieciem = obliczSilnie(6);
        czyToMojaLiczba(4);
        czyToMojaLiczba2(3);
    }

    private int obliczSilnie(int liczba) {
        int silnia = 1;
        int i = 2;

        if (liczba > 1) {
            while (i <= liczba) {
                silnia = silnia * i;
                i++;
            }
        }
        return silnia;
    }
    private void czyToMojaLiczba (int liczba){
        int licznik = 0;
        Random generator = new Random();
        while (generator.nextInt(5) != liczba){
            System.out.println("Liczba nie jest równa "+ liczba);
            licznik++;
        }
        System.out.println("Wylosowało moją liczbę "+ licznik + " razy");
    }

    private void czyToMojaLiczba2 (int liczba){
        int licznik = 0;
        Random generator = new Random();

        do {
            System.out.println("Liczba nie jest równa "+ liczba);
            licznik++;
        }
        while (generator.nextInt(5) != liczba);

        System.out.println("Wylosowało moją liczbę "+ licznik + " razy");
    }

}
