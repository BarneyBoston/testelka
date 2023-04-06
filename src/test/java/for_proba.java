import org.testng.annotations.Test;

public class for_proba {
    @Test
    public void forExample(){
        obliczSilnie(9);
    }
    private void obliczSilnie (int liczba){
        int silnia = 1;

        for (int i = 1; i<=liczba; i++){
            silnia = silnia * i;
        }
        System.out.println("Silnia z " + liczba + " wynosi " + silnia);
    }
}
