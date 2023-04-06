import org.testng.annotations.Test;

import java.awt.font.MultipleMaster;

public class Operatory {
    @Test
    public void examples (){
        int pierwsza = 11;
        int druga = 2;
        int wynikDodawania = pierwsza + druga;
        int wynikDodawanialiczb = 11 + 2;
        int wynikOdejmowania = pierwsza - druga;
        int wynikMnożenia = pierwsza * druga;
        int wynikdzielenia = pierwsza/druga;
        float wynikDzieleniaFloat = pierwsza/druga;

        double pierwszaDouble = 11;
        double wynikDzieleniaDouble = pierwszaDouble/druga;

        int wynikModulo = pierwsza%druga;

        pierwsza = pierwsza + druga;
        pierwsza += druga;

        System.out.println(druga);
        System.out.println(++druga);
        System.out.println(druga++);
        System.out.println(druga);
        ++druga;
        System.out.println(druga);

        int wynik = pierwsza + druga;
    }
}
