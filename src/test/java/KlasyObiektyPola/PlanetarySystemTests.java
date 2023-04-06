package KlasyObiektyPola;

import org.testng.annotations.Test;

public class PlanetarySystemTests {

    @Test
    public void firstTest(){
        PlanetarySystem solarSystem = new PlanetarySystem();
        solarSystem.printNumberOfPlanets();
        solarSystem.setNumberOfPlanets(7);
        solarSystem.printNumberOfPlanets();

        PlanetarySystem anotherSystem = new PlanetarySystem();
        anotherSystem.printNumberOfPlanets();
        anotherSystem.setNumberOfPlanets(5);
        anotherSystem.printNumberOfPlanets();

        solarSystem.printNumberOfPlanets();
    }
}


