import org.testng.annotations.Test;

public class proba {
    @Test
    public void test() {
        obliczsilnie(99);
    }

    private void obliczsilnie(int liczba) {
        int silnia = 1;
        int i = 1;
        int licznik = 0;

            while (i <= liczba) {
                silnia = silnia * i;
                i++;
                licznik++;
            }
        System.out.println("Silnia z " + liczba + " wynosi " + silnia);
        System.out.println("Dla liczby " + liczba + " pętla wykonała się " + licznik + " razy.");
    }

}
