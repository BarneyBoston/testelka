import org.testng.annotations.Test;

public class InstrukcjaWarunkowa {
    @Test
    public void ifExample() {
        int liczba = 102;

        if (liczba > 100) {
            System.out.println("Liczba " + liczba + " jest większa od 100");
            ++liczba;
        } else {
            System.out.println("Liczba " + liczba + " nie jest większa od 100");
            liczba = 100;
        }

        koniectestu();
        System.out.println("Liczba jest równa " + liczba);
    }
    void koniectestu() {
        System.out.println("Koniec Testu.");
    }
    @Test
    public void ifExample2(){
        int liczba = 100;
        if (liczba > 100) {
            System.out.println("Liczba " + liczba + " jest większa od 100");
            ++liczba;
        } else if (liczba>=0 && liczba<=100){
            System.out.println("Liczba " + liczba + " jest większa lub równa 0 i mniejsza lub równa 100");
            if (liczba==100) System.out.println("Liczba jest równa 100");
            liczba = 100;
        }
        else {
            System.out.println("Liczba " + liczba + " jest liczbą ujemną");
        }
        System.out.println("Liczba jest równa " + liczba);
    }
    @Test
    public void switchExample(){
        int liczba = 2;
        switch (liczba){
            case 0:
                System.out.println("Liczba jest równa 0");
                break;
            case 1:
                System.out.println("Liczba jest równa 1");
                break;
            case 2:
                System.out.println("Liczba jest równa 2");
                break;
            default:
                System.out.println("Liczba jest nieprawidłowa");
        }
    }
}

