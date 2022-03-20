public class Moon {
    String name;
    String discoverName;
    String discoverDate;
    String planet;

    public Moon(String planet, String name, String discoverName, String discoverDate) {
        this.planet = planet;
        this.name = name;
        this.discoverName = discoverName;
        this.discoverDate = discoverDate;
    }

    public String getName() {
        return name;
    }

    public String dropInfo(){
        return planet + "\n" +
                name + "\n" +
                discoverName + "\n" +
                discoverDate;
    }
}
