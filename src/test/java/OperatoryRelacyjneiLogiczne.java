import org.testng.annotations.Test;

public class OperatoryRelacyjneiLogiczne {
    @Test
    public void example(){
        int pierwszaZmienna = 2;
        int drugaZmienna = 4;
        int trzeciaZmienna = 2;

        boolean warunek = pierwszaZmienna == trzeciaZmienna;
        boolean warunek2 = 2 == 2;
        boolean warunek3 = pierwszaZmienna != trzeciaZmienna;

        boolean warunek4 = pierwszaZmienna < drugaZmienna;
        boolean warunek5 = pierwszaZmienna > drugaZmienna;
        boolean warunek6 = pierwszaZmienna <= trzeciaZmienna;
        boolean warunek7 = pierwszaZmienna >= trzeciaZmienna;

        boolean prawda = true;
        boolean fałsz = false;

        boolean warunek8 = !prawda;
        boolean warunek9 = prawda && prawda;
        boolean warunek10 = fałsz || prawda;
        boolean warunek11 = fałsz == prawda;
        boolean warunek12 = fałsz != prawda;

    }
}
