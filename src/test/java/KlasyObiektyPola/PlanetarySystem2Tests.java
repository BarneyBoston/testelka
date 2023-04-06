package KlasyObiektyPola;

import org.testng.annotations.Test;

//THIS IS CLASS FOR CONSTRUCTORS

public class PlanetarySystem2Tests {
    @Test
    public void firstTest() {
        PlanetarySystem2 planetarysystem = new PlanetarySystem2();
        PlanetarySystem2 solarsystem = new PlanetarySystem2("sun", "yellow dwarf", 8);
        PlanetarySystem2 keplarsystem = new PlanetarySystem2("keplar444","keplar dwarf",5);
    }
}
