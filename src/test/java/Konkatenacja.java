import org.testng.annotations.Test;

public class Konkatenacja {
    @Test
    public void example (){
        String pierwszaCzęść = "Na śniadanie zjadłem dzisiaj";
        String drugaCzęść = " jajecznicę ";
        String trzeciaCzęść = "na maśle.";

        String tekst = pierwszaCzęść + drugaCzęść + trzeciaCzęść;
        System.out.println(tekst);
        int liczba = 123;
        String tekstzLiczbą = tekst + liczba;
        System.out.println(tekstzLiczbą);
        boolean prawda = true;
        String tekstzBoolean = tekst + prawda;
        System.out.println(tekstzBoolean);
    }
}
