import java.util.Hashtable;
import java.util.Map;

public class DataBase {

    // EARTH
    public Planet earth(){
        return new Planet("Earth", "", "",
                SolarSystem.Classification.PLANET, 9.81);
    }

    public Map<String, String[]>  earthMoons(){
        Map<String, String[]>  moonMap = new Hashtable<>(1);
        String[] moon = new String[2];
        moon[0] = "Galileo Galilei"; // Discover name
        moon[1] = "1610";            // Discover date
        moonMap.put("Moon", moon);
        return moonMap;
    }

    // MARS
    public Planet mars(){
        return new Planet("Mars", "Galileo Galilei", "1610",
                SolarSystem.Classification.PLANET, 3.77);
    }

    public Map<String, String[]> marsMoons(){
        Map<String, String[]>  moonMap = new Hashtable<>(2);
        String[] deimos = new String[2];
        deimos[0] = "Voyager science team";
        deimos[1] = "July 1979";
        moonMap.put("Deimos", deimos);

        String[] phobos = new String[2];
        phobos[0] = "Asaph Hall";
        phobos[1] = "Aug. 11, 1877";
        moonMap.put("Phobos", phobos);
        return moonMap;
    }

    // MERCURY - No moons planet
    public Planet mercury(){
        return new Planet("Mercury", "Galileo Galilei", "17th century",
                SolarSystem.Classification.PLANET, 3.59);
    }

    // VENUS - No moons planet
    public Planet venus(){
        return new Planet("Venus", "Galileo Galilei", "17th century",
                SolarSystem.Classification.PLANET, 8.87);
    }

    // JUPITER
    public Planet jupiter(){
        return new Planet("Jupiter", "Galileo Galilei", "1610",
                SolarSystem.Classification.PLANET, 25.96);
    }

    public Map<String, String[]> jupiterMoons() {
        Map<String, String[]>  moonMap = new Hashtable<>(79);
        String[] adrastea = new String[2];
        adrastea[0] = "Voyager science team";
        adrastea[1] = "July 1979";
        moonMap.put("Adrastea", adrastea);

        String[] aitne = new String[2];
        aitne[0] = "Carme group";
        aitne[1] = "July 1979";
        moonMap.put("Aitne", aitne);

        String[] amalthea = new String[2];
        amalthea[0] = "Edward Emerson Barnard";
        amalthea[1] = "Sept. 9, 1892";
        moonMap.put("Amalthea", amalthea);

        String[] aoede = new String[2];
        aoede[0] = "Edward Emerson Barnard";
        aoede[1] = "Sept. 9, 1892";
        moonMap.put("Aoede", aoede);

        String[] autonoe = new String[2];
        autonoe[0] = "Edward Emerson Barnard";
        autonoe[1] = "Sept. 9, 1892";
        moonMap.put("Autonoe", autonoe);
        return moonMap;
    }

    // SATURN
    public Planet saturn(){
        return new Planet("Saturn", "Galileo Galilei", "1610",
                SolarSystem.Classification.PLANET, 25.96);
    }

    public Map<String, String[]> saturnMoons() { // 53 moons
        Map<String, String[]>  moonMap = new Hashtable<>(80);
        String[] aegaeon = new String[2];
        aegaeon[0] = "Scientists";
        aegaeon[1] = "Aug. 15, 2008";
        moonMap.put("Aegaeon", aegaeon);

        String[] aegir = new String[2];
        aegir[0] = "Scott S. Sheppard";
        aegir[1] = "Dec. 12, 2004";
        moonMap.put("Aegir", aegir);

        String[] anthe = new String[2];
        anthe[0] = "Cassini Imaging team";
        anthe[1] = "May 30, 2007";
        moonMap.put("Anthe", anthe);

        String[] atlas = new String[2];
        atlas[0] = "R. Terrile";
        atlas[1] = "1980";
        moonMap.put("Atlas", atlas);

        String[] bebhionn = new String[2];
        bebhionn[0] = "Scott S. Sheppard";
        bebhionn[1] = "Dec. 12, 2004";
        moonMap.put("Bebhionn", bebhionn);
        return moonMap;
    }

    // URANUS
    public Planet uranus(){
        return new Planet("Uranus", "William Herschel", "1781",
                SolarSystem.Classification.PLANET, 10.67);
    }
    public Map<String, String[]> uranusMoons() { //  moons
        Map<String, String[]>  moonMap = new Hashtable<>(23);

        String[] ariel = new String[2];
        ariel[0] = "William Lassell";
        ariel[1] = "Oct. 24, 1851";
        moonMap.put("Ariel", ariel);

        String[] cupid = new String[2];
        cupid[0] = "M.R. Showalter and J.J. Lissauer";
        cupid[1] = "Aug. 25, 2003";
        moonMap.put("Cupid", cupid);

        String[] cordelia = new String[2];
        cordelia[0] = "Voyager 2";
        cordelia[1] = "Jan. 20, 1986 ";
        moonMap.put("Cordelia", cordelia);

        String[] desdemona = new String[2];
        desdemona[0] = "Voyager 2";
        desdemona[1] = "Jan. 13 1986";
        moonMap.put("Desdemona", desdemona);

        return moonMap;
    }

    // NEPTUNE
    public Planet neptune(){
        return new Planet("Neptune", "Galileo Galilei", "1613",
                SolarSystem.Classification.PLANET, 14.07);
    }
    public Map<String, String[]> neptuneMoons() { // 23 moons
        Map<String, String[]>  moonMap = new Hashtable<>(23);

        String[] nereid = new String[2];
        nereid[0] = "Gerard P. Kuiper";
        nereid[1] = "May 1, 1949";
        moonMap.put("Nereid", nereid);

        String[] neso = new String[2];
        neso[0] = "Matthew J. Holman, John J. Kavelaars, Tommy Grav, Wesley C. Fraser, and Dan Milisavljevic";
        neso[1] = "2002";
        moonMap.put("Neso", neso);

        String[] aaiad = new String[2];
        aaiad[0] = "Voyager 2";
        aaiad[1] = "September 1989";
        moonMap.put("Naiad", aaiad);

        String[] sao = new String[2];
        sao[0] = "Tommy Grav, Matthew J. Holman, John J. Kavelaars, Wesley C. Fraser, and Dan Milisavljevic";
        sao[1] = "Aug. 14, 2002";
        moonMap.put("Sao", sao);
        return moonMap;
    }

    //--------------- Dwarf Planets
    // PLUTO
    public Planet pluto(){
        return new Planet("Pluto", "Clyde Tombaugh", "1930",
                SolarSystem.Classification.DWARF_PLANET);
    }

    public Map<String, String[]> plutoMoons() {
        Map<String, String[]>  moonMap = new Hashtable<>();

        String[] charon = new String[2];
        charon[0] = "";
        charon[1] = "";
        moonMap.put("Charon", charon);

        String[] hydra = new String[2];
        hydra[0] = "Hal Weaver";
        hydra[1] = "2005";
        moonMap.put("Hydra", hydra);

        String[] kerberos = new String[2];
        kerberos[0] = "";
        kerberos[1] = "";
        moonMap.put("Kerberos", kerberos);

        String[] nix = new String[2];
        nix[0] = "Hal Weaver";
        nix[1] = "2005";
        moonMap.put("Nix", nix);

        String[] styx = new String[2];
        styx[0] = "Mark Showalter";
        styx[1] = "June 26, 2012";
        moonMap.put("Styx", styx);
        return moonMap;
    }

    // MAKEMAKE
    public Planet makemake(){
        return new Planet("Makemake", "M. E. Brown, C. A. Trujillo, and D. L. Rabinowitz",
                "31 Mar. 2005", SolarSystem.Classification.DWARF_PLANET);
    }

    // CERES
    public Planet ceres(){
        return new Planet("Ceres", "Giuseppe Piazzi", "1801",
                SolarSystem.Classification.DWARF_PLANET);
    }

    // HAUMEA
    public Planet haumea(){
        return new Planet("Haumea", "Sierra Nevada Observatory",
                "7 Mar. 2003", SolarSystem.Classification.DWARF_PLANET);
    }

    // ERIS
    public Planet eris(){
        return new Planet("Eris", "M. E. Brown, C. A. Trujillo and D. Rabinowitz",
                "21 Oct. 2003", SolarSystem.Classification.DWARF_PLANET);
    }
}
