
public  class Mammal extends Animal {

    private String furColor;
    public Mammal() {
        super();
        this.furColor = "Unknown";
    }
    public String getFurColor() {
        return furColor;
    }
    public Mammal(String name, int age, double weight, String furColor) {
        super();
        this.furColor = furColor;
    }
    public String getVoice() {
        return "Mammal sound";
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    @Override
    public String toString() {
        return super.toString() + ", furColor='" + furColor + "'";
    }
}
