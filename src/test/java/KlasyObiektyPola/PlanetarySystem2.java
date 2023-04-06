package KlasyObiektyPola;

public class PlanetarySystem2 {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem2 (String starName,String starType, int numberOfPlanets){
        this.starName = starName;
        this.starType = starType;
        this.numberOfPlanets = numberOfPlanets;

        System.out.println("Star name: "+starName +"\n"+"Star type: "+starType+"\n"+"Number of planets: "+numberOfPlanets);
    }
    public PlanetarySystem2(){}
}
