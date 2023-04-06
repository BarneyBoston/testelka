package ReferenceTypes;

import KlasyObiektyPola.PlanetarySystem;
import KlasyObiektyPola.PlanetarySystem2;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TypesTests {

    @Test
    public void doesIntChangeValueTest(){
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;
        int thirdInt = firstInt;
        System.out.println(secondInt);
        System.out.println(thirdInt);
    }
    @Test
    public void doesObjectChangeValueTest(){
        PlanetarySystem firstSystem = new PlanetarySystem();
        PlanetarySystem secondSystem = firstSystem;
        firstSystem.setNumberOfPlanets(13);
        Assertions.assertEquals(13,secondSystem.getNumberOfPlanets());
    }
    @Test
    public void doesStringChangeValueTest(){
        String firstString = "pierwszy";
        String secondString = firstString;
        firstString = "zmieniony";
        Assertions.assertEquals("pierwszy",secondString);
    }
}
