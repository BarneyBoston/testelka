import org.testng.annotations.Test;

public class PetleForEachFor {
    @Test
    public void forExample(){
        int silnia1 = obliczSilnie(6);

    }
    private int obliczSilnie (int liczba){
        int silnia = 1;

        for(int i =1; i<=liczba; i++){
            silnia = silnia * i;
        }
        return silnia;
    }
    @Test
    public void forEachExample(){
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Satrun", "Uran", "Neptun"};
        String tekst = "Planety układu słonecznego to:";
        for(String planeta : planety){
            tekst = tekst + "\n" + planeta;
        }
        System.out.println(tekst);
    }
}
