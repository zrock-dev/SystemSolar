import java.util.Hashtable;
import java.util.Map;

public class Planet {
    String name, discoverName, discoverDate;
    SolarSystem.Classification type;
    Map<String, Moon> mapMoons;
    int moonAmount;
    double gravity;

    public Planet(String name, String discoverName, String discoverDate, SolarSystem.Classification type,
                  double gravity) {
        mapMoons = new Hashtable<>();
        this.name = name;
        this.discoverName = discoverName;
        this.discoverDate = discoverDate;
        this.type = type;
        this.gravity = gravity;
    }

    public Planet(String name, String discoverName, String discoverDate, SolarSystem.Classification type) {
        mapMoons = new Hashtable<>();
        this.name = name;
        this.discoverName = discoverName;
        this.discoverDate = discoverDate;
        this.type = type;
    }

    public Map<String, Moon> getMapMoons() {
        return mapMoons;
    }

    public void createMoons(Map<String, String[]> moonSet){

        for (String moonName:
             moonSet.keySet()) {
           String[] moonData = moonSet.get(moonName);
           Moon moon = new Moon(name ,moonName, moonData[0], moonData[1]);
           mapMoons.put(moonName, moon);
        }
        moonAmount = moonSet.size();
    }

    public void dropInfo(){
        System.out.println(name + "\n" +
                gravity  + "\n" +
                discoverName + "\n" +
                discoverDate + "\n" +
                type + "\n");

    }

    public String getMoonAmount() {
        return name + "\n" +
                moonAmount;
    }
}