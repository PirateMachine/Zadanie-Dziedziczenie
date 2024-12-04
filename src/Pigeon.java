public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    public Pigeon(String name, int age) {
        super();
        this.species = "Unknown";
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getVoice() {
        return "_";
    }
    @Override
    public String toString() {
        return super.toString() + ", species='" + species + "'";
    }
}