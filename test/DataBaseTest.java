import org.junit.jupiter.api.Test;

/*
    Gabriel Santiago Concha Saavedra
 */

class DataBaseTest {
    static SolarSystem solarSystem = new SolarSystem("Milky Way");

    public void fillData(){
        DataBase dataBase = new DataBase();

        // Planet
        solarSystem.createPlanet(dataBase.mercury(), null);
        solarSystem.createPlanet(dataBase.venus(), null);
        solarSystem.createPlanet(dataBase.earth(), dataBase.earthMoons());
        solarSystem.createPlanet(dataBase.mars(), dataBase.marsMoons());
        solarSystem.createPlanet(dataBase.jupiter(), dataBase.jupiterMoons());
        solarSystem.createPlanet(dataBase.saturn(), dataBase.saturnMoons());
        solarSystem.createPlanet(dataBase.uranus(), dataBase.uranusMoons());
        solarSystem.createPlanet(dataBase.neptune(), dataBase.neptuneMoons());

        // Dwarf Planet
        solarSystem.createPlanet(dataBase.pluto(), dataBase.plutoMoons());
        solarSystem.createPlanet(dataBase.ceres(), null);
        solarSystem.createPlanet(dataBase.makemake(), null);
        solarSystem.createPlanet(dataBase.haumea(), null);
        solarSystem.createPlanet(dataBase.eris(), null);

    }

    @Test
    public void firstQuestion(){
        fillData();
        solarSystem.infoPlanet("Mars");
    }

    @Test
    public void secondQuestion(){
        fillData();
        solarSystem.infoMoon("Phobos");
    }

    @Test
    public void thirdQuestion(){
        fillData();
        solarSystem.sortPlanets(SolarSystem.Classification.DWARF_PLANET);
    }

    @Test
    public void forthQuestion(){
        fillData();
        solarSystem.listNoMoonPlanets();
    }

    @Test
    public void fifthQuestion(){
        fillData();
        solarSystem.listConfirmedMoons();
    }
}