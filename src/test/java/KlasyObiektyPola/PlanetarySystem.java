package KlasyObiektyPola;

import org.testng.annotations.Test;

//THIS IS CLASS FOR CLASSESS/OBJECTS/FIELDS
public class PlanetarySystem {
    private String starName = "Sun";
    private String starType = "yellow dwarf";
    private int numberOfPlanets = 8;

    public String getStarName(){
        return starName;
    }
    public void setNumberOfPlanets (int number){
        numberOfPlanets = number;
    }
    public int getNumberOfPlanets(){
        return numberOfPlanets;
    }
    public void printNumberOfPlanets(){
        System.out.println("Number of planets: "+ numberOfPlanets);
    }
}
