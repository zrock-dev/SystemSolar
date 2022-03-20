import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolarSystem {
    String address;
    Map<String, Planet> solarSystem;  // the keys must be unique
    ArrayList<Planet> noMoonPlanets;

    enum Classification {
        PLANET, DWARF_PLANET
    }

    public SolarSystem(String address){
        this.address = address;
        solarSystem  = new HashMap<>();
        noMoonPlanets = new ArrayList<>();
    }

    public void createPlanet(Planet planet, Map<String, String[]>  confirmedMoonSet){
        solarSystem.put(planet.name, planet);

        if (confirmedMoonSet != null){
            planet.createMoons(confirmedMoonSet);
        }else if (planet.type == Classification.PLANET) {
            noMoonPlanets.add(planet);
        }

    }

    public void infoPlanet(String namePlanet){
       Planet planet = solarSystem.get(namePlanet);
       planet.dropInfo();
    }

    public void infoMoon(String nameMoon){
        for (Planet planet:
             solarSystem.values()) {
            for (Moon moon:
                 planet.getMapMoons().values()) {
                if (nameMoon.equals(moon.getName())){
                    System.out.println(moon.dropInfo());
                    break;
                }
            }
        }
    }

    public void listNoMoonPlanets(){
        for (Planet planet:
             noMoonPlanets) {
            planet.dropInfo();
        }
    }

    public void listConfirmedMoons(){
        for (Planet planet:
             solarSystem.values()) {
            if (planet.type == Classification.PLANET){
                System.out.println(planet.getMoonAmount() + "\n");
            }
        }
    }

    public void sortPlanets(Classification classification){
        for (Planet planet:
             solarSystem.values()) {
            if(planet.type == classification){
                planet.dropInfo();
            }
        }
    }
}
