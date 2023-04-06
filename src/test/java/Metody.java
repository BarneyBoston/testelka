import org.testng.annotations.Test;

public class Metody {
    @Test
    public void examples () {
        double PoleTrapezuPierwszego = obliczPoleTrapezu(8,10,5);
        System.out.println(PoleTrapezuPierwszego);
        double PoleTrapezuDrugiego = ((6+8)*3)/2;
        double PoleTrapezuTrzeciego = ((12+10)*6)/2;
        String tekst = "Pola trapezów to: " + PoleTrapezuPierwszego + ", " + PoleTrapezuDrugiego + ", " + PoleTrapezuTrzeciego + ".";
        wypiszKoniec();
        wypiszTekst("Koniec testu");
        boolean czyWieksza = czyWiekszaNizSto(120);
        obliczPoleTwojejStarej(2,3);
        obliczrowniezPoleTrapezu(8,10,12);

    }

    double obliczPoleTrapezu (double pierwszaPodstawa, double drugaPodstawa, double wysokosc){
        double poleTrapezu = ((pierwszaPodstawa + drugaPodstawa)*wysokosc)/2;
        return poleTrapezu;
    }
    void obliczrowniezPoleTrapezu (double pierwszaPodstawa, double drugaPodstawa, double wysokosc) {
        double rowniezPoleTrapezu = ((pierwszaPodstawa + drugaPodstawa) * wysokosc) / 2;
        System.out.println(rowniezPoleTrapezu);
    }

    boolean czyWiekszaNizSto (int liczba){
        return liczba>100;
    }
    void wypiszKoniec(){
        System.out.println("Koniec testu.");
    }
    void wypiszTekst(String tekst){
        System.out.println(tekst);
    }

    void obliczPoleTwojejStarej (double szerokoscTwojejStarej, double wysokoscTwojejStarej){
        double poleTwojejStarej = szerokoscTwojejStarej*wysokoscTwojejStarej;
        System.out.println(poleTwojejStarej);
    }

}
